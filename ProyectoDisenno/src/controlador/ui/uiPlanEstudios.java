package controlador.ui;

import controlador.DataLoader;
import datos.Curso;
import datos.Docente;
import gui.PlanEstudios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class uiPlanEstudios {
    
    PlanEstudios planEstudios;

    public uiPlanEstudios(PlanEstudios planEstudios) {
        this.planEstudios = planEstudios;
    }            
    
    public void populateTableCursos()
    {
        DataLoader loader = new DataLoader();  
        ArrayList<Curso> cursos = loader.cargarCursos();       
        DefaultTableModel model = (DefaultTableModel) planEstudios.getTablaCursos().getModel();
        Object rowData [] = new Object[3];
        for(int i = 0; i < cursos.size(); i++)
        {
            rowData[0] = String.valueOf(cursos.get(i).getCodigoCurso());                    
            rowData[1] = cursos.get(i).getNombreCurso();                    
            rowData[2] = String.valueOf(cursos.get(i).getCreditos());                    
            model.addRow(rowData);
        }                        
    }      
}
