package controlador;

import controlador.dto.DTOofertaAcademica;
import datos.CreditosEnum;
import datos.Curso;
import datos.Docente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jxl.Cell;
import com.my.GoogleForms;
import datos.Solicitud;

public class DataLoader 
{       
    
    public void cargaInicialSolicitudes()
    {
        try
        {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\USER\\Desktop\\ExcelDiseno\\Solicitudes.ld");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);   
        ArrayList<Solicitud> solicitudesLocales = new ArrayList<>();
        boolean cont = true;
        while(cont)
        {
            Solicitud solicitud = (Solicitud)objectInputStream.readObject();            
            if(solicitud != null)            
                solicitudesLocales.add(solicitud);             
            else
                cont = false; 
        }
        fileInputStream.close();
        objectInputStream.close();
        
        String hojaID = ConfigurationPaths.getInstance().getPathGoogleDriveExcel();
        String hojaFormato = ConfigurationPaths.getInstance().getFormatoGoogleFriveExcel();        
        GoogleForms google = new GoogleForms(hojaID, hojaFormato, "APP");
        
        
        
        }catch(Exception ex)
        {
            
        }
        
    }            
    
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
                
    public ArrayList<Curso> cargarCursos()
    {
        try{
            String path = ConfigurationPaths.getInstance().getPathCursos();       
            Excel excel = new Excel(path);
            ArrayList<Curso> listaCursos = new ArrayList<>();
            int rowCount = excel.getSheet().getRows();
            int columnCount = excel.getSheet().getColumns();
            for(int row = 1; row < rowCount; row++)
            {
                ArrayList<Cell> sheetCells = new ArrayList<>();
                for(int column = 0; column < columnCount; column++)
                {                    
                    sheetCells.add(excel.getSheet().getCell(column, row));   
                }
                String codigoCurso = sheetCells.get(0).getContents();
                String nombreCurso = sheetCells.get(1).getContents();
                CreditosEnum creditos = CreditosEnum.valueOf(sheetCells.get(2).getContents());
                Curso curso = new Curso(codigoCurso, nombreCurso, creditos);
                listaCursos.add(curso);
            }
            return listaCursos;
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null; 
        }
    }
    
    public ArrayList<DTOofertaAcademica> cargarOfertaAcademica()
    {
        try{
            String path = ConfigurationPaths.getInstance().getPathOfertaAcademica();
            Excel excel = new Excel(path);
            ArrayList<DTOofertaAcademica> listaOferta = new ArrayList<>();
            int rowCount = excel.getSheet().getRows();
            int columnCount = excel.getSheet().getColumns();
            for(int row = 1; row < rowCount; row ++)
            {
                ArrayList<Cell> sheetCells = new ArrayList<>();
                for(int column = 0; column < columnCount; column++)
                {
                    sheetCells.add(excel.getSheet().getCell(column, row));                       
                }
                String codigoCurso = sheetCells.get(0).getContents();
                String nombreCurso = sheetCells.get(1).getContents();
                String grupo = sheetCells.get(2).getContents();
                String idProfesor = sheetCells.get(3).getContents();
                String nombreProfesor = sheetCells.get(4).getContents();
                String primeraFechaHora = sheetCells.get(5).getContents();
                String segundaFechaHora = sheetCells.get(6).getContents();
                String aula = sheetCells.get(7).getContents();
                DTOofertaAcademica dto = new DTOofertaAcademica(codigoCurso, nombreCurso, grupo, idProfesor,                        
                nombreProfesor ,primeraFechaHora, segundaFechaHora, aula);                
                listaOferta.add(dto);
            }    

        return listaOferta;
        }catch (Exception ex)
        {
            return null;
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
            for(int column = 0; column < columnCount; column++)
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
    
        
    public static void main(String args[])
    {
        try{
        ConfigurationPaths.getInstance(); 
        ConfigurationPaths.getInstance().setPathCarteraDocentes("C:\\Users\\USER\\Desktop\\ExcelDiseno\\profesores.xls");    
        ConfigurationPaths.getInstance().setPathCursos("C:\\Users\\USER\\Desktop\\ExcelDiseno\\cursos.xls");
        ConfigurationPaths.getInstance().setPathOfertaAcademica("C:\\Users\\USER\\Desktop\\ExcelDiseno\\ofertaacademica.xls");
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
    
    
    
    
    
}
