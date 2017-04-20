package controlador.ui;

import controlador.DataLoader;
import controlador.dto.DTOofertaAcademica;
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
    
    public void populateTablaCursos()
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
    
    public void populateTablaOfertaAcademica()
    {
        DataLoader loader = new DataLoader();
        ArrayList<DTOofertaAcademica> ofertas = loader.cargarOfertaAcademica();
        DefaultTableModel model = (DefaultTableModel) planEstudios.getTablaOfertaAcademica().getModel();
        Object rowData [] = new Object[8];
        for(int i = 0; i < ofertas.size(); i++)
        {
            rowData[0] = ofertas.get(i).getCodigo();
            rowData[1] = ofertas.get(i).getNombre();
            rowData[2] = ofertas.get(i).getNumeroGrupo();
            rowData[3] = ofertas.get(i).getIdProfesor();
            rowData[4] = ofertas.get(i).getNombreProfesor();
            rowData[5] = ofertas.get(i).getPrimeraFechaHora();
            rowData[6] = ofertas.get(i).getSegundaFechaHora();
            rowData[7] = ofertas.get(i).getAula();
            model.addRow(rowData);
        }        
    }        
}
