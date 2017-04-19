package controlador;

import datos.Docente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jxl.Cell;

public class DataLoader 
{        
    public void cargarPrimerosDatos() 
    {             
        try{
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\USER\\Desktop\\ExcelDiseno\\ConfigurationsFile.ld");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);                
        ConfigurationPaths.setInstance((ConfigurationPaths) objectInputStream.readObject());        
        fileInputStream.close();
        objectInputStream.close();                
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
    
    
    /*
    public static void main(String args[])
    {
        try{
        ConfigurationPaths.getInstance(); 
        ConfigurationPaths.getInstance().setPathCarteraDocentes("C:\\Users\\USER\\Desktop\\ExcelDiseno\\profesores.xls");        
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\USER\\Desktop\\ExcelDiseno\\ConfigurationsFile.ld");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);          
        objectOutputStream.writeObject(ConfigurationPaths.getInstance());
        objectOutputStream.close();
        fileOutputStream.close();
        }catch(Exception ex)
        {
            System.out.println(ex.getLocalizedMessage());
        }                
    }
    */
}
