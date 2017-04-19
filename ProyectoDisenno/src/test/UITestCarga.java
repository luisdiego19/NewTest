package test;

import gui.PanelSolicitudes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;

public class UITestCarga 
{    
    private final PanelSolicitudes panel;    
    public UITestCarga(PanelSolicitudes pPanel)            
    {
        this.panel = pPanel;
    }
                
    public ArrayList<TestClass> getData()
    {
        try{
        Excel excel = new Excel("C:\\Users\\USER\\Desktop\\LibroPrueba.xls");                      
        ArrayList<TestClass> testList = new ArrayList<>();
        int rows = excel.getSheet().getRows();
        int columns = excel.getSheet().getColumns();
        for(int i = 0; i < rows; i++)
        {
            ArrayList<Cell> cells = new ArrayList<>();     
            for(int j = 0; j < columns; j++)
            {
                Cell cell = excel.getSheet().getCell(j, i);   
                System.out.println(cell.getContents());
                cells.add(cell);
            }
            TestClass testClass = new TestClass(cells.get(0).getContents(), cells.get(1).getContents());
            testList.add(testClass);                        
        }                                       
        return testList;
        } catch (Exception ex)
        {
            return null; 
        }                        
    }
    
    
    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) panel.getTablaSolicitudes().getModel();                
        Object rowData [] = new Object[4];
        ArrayList<TestClass> data = getData();
        for(int i = 0; i < data.size(); i++)
        {
            rowData[0] = data.get(i).getTextOne();
            rowData[1] = data.get(i).getTextTwo();
            model.addRow(rowData);
        }                                
    }    
}
