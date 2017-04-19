package controlador;

import datos.Docente;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jxl.Cell;

public class DataLoader 
{    
    
    public void initialLoader() throws Exception 
    {        
        File file = new File("");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);                
        ConfigurationPaths.setInstance((ConfigurationPaths) objectInputStream.readObject());
        fileInputStream.close();
        objectInputStream.close();                
    }
    
    public ArrayList<Docente> cargarCarteraDocente()
    {
        try{
        String path = ConfigurationPaths.getInstance().getPathCarteraDocentes();
        Excel excel = new Excel(path);
        ArrayList<Docente> listaDocentes = new ArrayList<>();
        int rowCount = excel.getSheet().getRows();
        int columnCount = excel.getSheet().getColumns();
        for(int row = 1; row < rowCount; row ++)
        {
            ArrayList<Cell> sheetCells = new ArrayList<>();
            for(int column = 1; column < columnCount; column++)
            {
                sheetCells.add(excel.getSheet().getCell(column, row));
            }
            String identificacion = sheetCells.get(0).getContents();
            String nombre = sheetCells.get(1).getContents();
            String correo = sheetCells.get(2).getContents();
            String telefono = sheetCells.get(3).getContents();
            Docente docente = new Docente(identificacion, nombre, " ", correo, telefono);
            listaDocentes.add(docente);
        }
        return listaDocentes;         
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null; 
        }
    }            
}
