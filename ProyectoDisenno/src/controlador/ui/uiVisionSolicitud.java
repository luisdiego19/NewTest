package controlador.ui;

import controlador.Controlador;
import controlador.dao.DAOsolicitudes;
import datos.EstadoEnum;
import datos.Solicitud;
import gui.TramiteSolicitud;
import gui.VisionSolicitud;

public class uiVisionSolicitud 
{
    private final VisionSolicitud visionSolicitud; 
    private Solicitud solicitud;
    private Controlador control = new Controlador();

    public uiVisionSolicitud(VisionSolicitud visioSolicitud) {
        this.visionSolicitud = visioSolicitud; 
    }      
                    
    public void llenarDatos()
    {
        String codigo = solicitud.getCodigo();
        String fecha = solicitud.getFecha().getDate().toString();
        String idSolicitante = solicitud.getIdentificacion();
        String nombreSolicitante = solicitud.getNombreSolicitante();
        String periodo = solicitud.getPeriodo().getNombre();
        String curso = solicitud.getCurso().getNombreCurso();
        String grupo = String.valueOf(solicitud.getGrupo().getNumeroGrupo());
        String inconsistencia = String.valueOf(solicitud.getInconsistencia());
        String estado = String.valueOf(solicitud.getEstado());
        
        visionSolicitud.getTxtSolNumero().setText(codigo);
        visionSolicitud.getTxtSolFecha().setText(fecha);
        visionSolicitud.getTxtSolID().setText(idSolicitante);
        visionSolicitud.getTxtSolNombreSolicitante().setText(nombreSolicitante);
        visionSolicitud.getTxtSolPeriodo().setText(periodo);
        visionSolicitud.getTxtSolCurso().setText(curso);
        visionSolicitud.getTxtSolGrupo().setText(grupo);
        visionSolicitud.getTxtSolInconsistencia().setText(inconsistencia);
        visionSolicitud.getTxtSolEstado().setText(estado);
                
        String carnetEstudiante = String.valueOf(solicitud.getEstudiante().getCarnet());
        String nombreEstudiante = solicitud.getEstudiante().getNombre() + " " + 
                solicitud.getEstudiante().getApellidos();
        String numeroTelefonico = solicitud.getEstudiante().getTelefono();
                
        visionSolicitud.getTxtEstCarnet().setText(carnetEstudiante);
        visionSolicitud.getTxtEstNombre().setText(nombreEstudiante);
        visionSolicitud.getTxtEstNumero().setText(numeroTelefonico);
                                        
        String detalles = solicitud.getDetalles();
        
        visionSolicitud.getAreaTextDetalles().setText(detalles);                                                        
    }
    
    public void accionBtnTramitar()
    {        
        TramiteSolicitud tramiteSolicitud = new TramiteSolicitud();
        tramiteSolicitud.setDefaultCloseOperation(TramiteSolicitud.DISPOSE_ON_CLOSE);        
        tramiteSolicitud.getUi().setSolicitud(solicitud);
        tramiteSolicitud.getUi().llenarDatos();
        tramiteSolicitud.setVisible(true);                
    }
    
    public void accionBtnAnular()
    {
        solicitud.setEstado(EstadoEnum.ANULADA);
        visionSolicitud.getTxtSolEstado().setText("ANULADA");
        DAOsolicitudes dao = new DAOsolicitudes();
        dao.actualizarSolicitud(solicitud);
        visionSolicitud.getBtnTramitar().setVisible(false);
        visionSolicitud.getBtnGenerarHTML().setVisible(false);
    }
    
    
    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }   
}
