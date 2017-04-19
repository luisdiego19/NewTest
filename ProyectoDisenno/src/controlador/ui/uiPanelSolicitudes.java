package controlador.ui;

import datos.Solicitud;
import gui.PanelSolicitudes;
import java.util.ArrayList;
import jxl.Cell;
import controlador.Excel;
import datos.Periodo;
import java.util.Date;
import test.TestClass;

public class uiPanelSolicitudes 
{    
    private final PanelSolicitudes panel;
    
    public uiPanelSolicitudes(PanelSolicitudes pPanel)            
    {
        this.panel = pPanel;
    }
                        
    public ArrayList<Solicitud> getDatosSolicitudes(String pPathLocal, String pIDHojaDrive)
    {
        try{
            Excel excel = new Excel(pPathLocal); 
            ArrayList<Solicitud> solicitudes = new ArrayList<>();
            int rows = excel.getSheet().getRows();
            int columns = excel.getSheet().getColumns();                            
            for(int i = 0; i < rows; i++)
            {
                ArrayList<Cell> cells = new ArrayList<>();     
                for(int j = 0; j < columns; j++)
                {
                    Cell cell = excel.getSheet().getCell(j, i);                       
                    cells.add(cell);
                }
                
                String hojaFecha = cells.get(0).getContents();
                String fecha = hojaFecha.split("\\s+")[0];
                String tiempo = hojaFecha.split("\\s+")[1];
                
                int dia = Integer.parseInt(fecha.split("/")[0]);
                int mes = Integer.parseInt(fecha.split("/")[1]);
                int anno = Integer.parseInt(fecha.split("/")[2]);
                
                int horas = Integer.parseInt(tiempo.split(":")[0]);
                int minutos = Integer.parseInt(tiempo.split(":")[1]);
                int segundos = Integer.parseInt(tiempo.split(":")[2]);
                
                Date date = new Date(anno, mes, dia, horas, minutos, segundos);
                String identificacion = cells.get(1).getContents();
                Periodo periodo = new Periodo(cells.get(2).getContents());
                
                
// (Date Fecha, String Identificacion, Periodo periodo, Grupo grupo, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, Object Adjuntos, EstadoEnum Estado)
                //Solicitud solicitud = new Solicitud()
               // TestClass testClass = 
                //new TestClass(cells.get(0).getContents(), cells.get(1).getContents());
               // testList.add(testClass);                        
            }                                       
            return solicitudes;
            } catch (Exception ex)
            {
                return null; 
            }                        
    }            
}