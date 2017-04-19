package controlador.ui;

import datos.Solicitud;
import gui.VisionSolicitud;

public class uiVisionSolicitud 
{
    private final VisionSolicitud visioSolicitud; 
    private Solicitud solicitud;

    public uiVisionSolicitud(VisionSolicitud visioSolicitud) {
        this.visioSolicitud = visioSolicitud; 
    }      

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }                                
}
