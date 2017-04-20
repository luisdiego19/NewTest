package controlador.ui;

import controlador.DataLoader;
import gui.PanelSolicitudes;
import gui.BackOffice;
import gui.CarteraDocente;
import gui.Configuraciones;
import gui.Estadisticas;
import gui.PlanEstudios;
import gui.VisionSolicitud;
import controlador.Datos;
import datos.DTOSolicitud;
import javax.swing.table.DefaultTableModel;

public class uiPanelSolicitudes 
{    
    private final PanelSolicitudes panelSolicitudes;
    
    public uiPanelSolicitudes(PanelSolicitudes pPanel)            
    {
        this.panelSolicitudes = pPanel;
        DataLoader loader = new DataLoader();
        loader.cargarPrimerosDatos();
        Datos.getInstance().setSolicitudes(loader.cargaInicialSolicitudes());
    }
                    
    public void populateTablaSolicitudes()
    {
        DefaultTableModel model = (DefaultTableModel)panelSolicitudes.getTablaSolicitudes().getModel();
        Object rowData [] = new Object[10];
        for(int i = 0; i < Datos.getInstance().getSolicitudes().size(); i++)
        {
            rowData[0] = Datos.getInstance().getSolicitudes().get(i).getCodigo();
            rowData[1] = Datos.getInstance().getSolicitudes().get(i).getFecha().getDate().toString();
            rowData[2] = Datos.getInstance().getSolicitudes().get(i).getIdentificacion();
            rowData[3] = Datos.getInstance().getSolicitudes().get(i).getNombreSolicitante();
            rowData[4] = Datos.getInstance().getSolicitudes().get(i).getPeriodo().getNombre();
            rowData[5] = Datos.getInstance().getSolicitudes().get(i).getCurso().getNombreCurso();
            rowData[6] = Datos.getInstance().getSolicitudes().get(i).getGrupo().getNumeroGrupo();
            rowData[7] = String.valueOf(Datos.getInstance().getSolicitudes().get(i).getEstudiante().getCarnet());
            rowData[8] = Datos.getInstance().getSolicitudes().get(i).getEstudiante().getNombre();
            rowData[9] = String.valueOf(Datos.getInstance().getSolicitudes().get(i).getEstado());            
            model.addRow(rowData);
        }
    }

   
    public void accionMenuBackOffice()            
    {                       
        BackOffice backOffice = new BackOffice();
        backOffice.setDefaultCloseOperation(BackOffice.DISPOSE_ON_CLOSE);
        backOffice.setVisible(true);                 
    }
    
    public void accionMenuConfiguraciones()
    {
        Configuraciones configuraciones = new Configuraciones();
        configuraciones.setDefaultCloseOperation(Configuraciones.DISPOSE_ON_CLOSE);
        configuraciones.setVisible(true);        
    }
    
    public void accionMenuEstadisticas()
    {
        Estadisticas estadisticas = new Estadisticas();
        estadisticas.setDefaultCloseOperation(Estadisticas.DISPOSE_ON_CLOSE);
        estadisticas.setVisible(true); 
    }
    
    public void accionMenuCarteraDocente()
    {
        CarteraDocente carteraDocente = new CarteraDocente();
        carteraDocente.setDefaultCloseOperation(CarteraDocente.DISPOSE_ON_CLOSE);
        carteraDocente.setVisible(true); 
    }
    
    public void accionMenuPlanEstudios()
    {
        PlanEstudios planEstudios = new PlanEstudios();
        planEstudios.setDefaultCloseOperation(PlanEstudios.DISPOSE_ON_CLOSE);
        planEstudios.setVisible(true);
    }
                       
    public void accionBtnVerSolicitud()
    {
        VisionSolicitud visionSolicitud = new VisionSolicitud();
        visionSolicitud.setDefaultCloseOperation(VisionSolicitud.DISPOSE_ON_CLOSE); 
        DTOSolicitud solicitud = Datos.getInstance().getSolicitudCodigo(panelSolicitudes.getTxtNumeroSolicitud().getText());
        visionSolicitud.getUi().setSolicitud(solicitud);
        visionSolicitud.getUi().llenarDatos();
        visionSolicitud.setVisible(true);        
    }                
}
