package controlador.ui;

import controlador.DataLoader;
import datos.Docente;
import gui.CarteraDocente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class uiCarteraDocentes 
{    
    private final CarteraDocente carteraDocente; 
        
    public uiCarteraDocentes(CarteraDocente pCartera)            
    {
        this.carteraDocente = pCartera;        
    }
    
    public void populateTablaDocentes()
    {
        DataLoader loader = new DataLoader();  
        ArrayList<Docente> docentes = loader.cargarCarteraDocente();        
        DefaultTableModel model = (DefaultTableModel) carteraDocente.getTablaDocentes().getModel(); 
        Object rowData [] = new Object[4];
        for(int i = 0; i < docentes.size(); i++)
        {
            rowData[0] = docentes.get(i).getIdentificacion();
            rowData[1] = docentes.get(i).getNombre();
            rowData[2] = docentes.get(i).getCorreo();
            rowData[3] = docentes.get(i).getTelefono(); 
            model.addRow(rowData);
        }                        
    }                
}
    