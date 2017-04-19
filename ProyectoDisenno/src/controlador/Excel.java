package controlador;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Excel {
    
    private final File file; 
    private final Sheet sheet;    
    
    public Excel(String filePath) throws Exception 
    {
        this.file = new File(filePath);        
        this.sheet = Workbook.getWorkbook(this.file).getSheet(0);        
    }
        
    public Sheet getSheet() {
        return sheet;
    }            
}
