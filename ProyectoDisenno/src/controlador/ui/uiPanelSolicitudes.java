package controlador.ui;

import datos.Solicitud;
import gui.PanelSolicitudes;
import java.util.ArrayList;
import jxl.Cell;
import controlador.Excel;
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
                TestClass testClass = 
                new TestClass(cells.get(0).getContents(), cells.get(1).getContents());
               // testList.add(testClass);                        
            }                                       
            return solicitudes;
            } catch (Exception ex)
            {
                return null; 
            }                        
    }            
}
