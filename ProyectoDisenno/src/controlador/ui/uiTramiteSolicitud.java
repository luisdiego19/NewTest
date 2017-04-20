package controlador.ui;

import datos.Considerando;
import datos.Solicitud;
import gui.TramiteSolicitud;

public class uiTramiteSolicitud {
    
    private TramiteSolicitud tramiteSolicitud;
    private Solicitud solicitud;

    public void llenarDatos()
    {
        String considerandos = ""; 
        for(Considerando considerando: solicitud.getConsiderandos())
        {
            considerandos = considerandos + String.valueOf(considerando.getCodigo()) +
                    " " + considerando.getAnotacion() + "\n";            
        }
        tramiteSolicitud.getAreaTextTodosConsiderandos().setText(considerandos);
    }        
    
    public uiTramiteSolicitud(TramiteSolicitud tramiteSolicitud) {
        this.tramiteSolicitud = tramiteSolicitud;
    }

    public TramiteSolicitud getTramiteSolicitud() {
        return tramiteSolicitud;
    }

    public void setTramiteSolicitud(TramiteSolicitud tramiteSolicitud) {
        this.tramiteSolicitud = tramiteSolicitud;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }        
}
