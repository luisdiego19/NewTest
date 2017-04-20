package controlador.ui;

import controlador.dao.DAOsolicitudes;
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
    
    public void accionModificarConsiderando()
    {
        int numeroConsiderando = (Integer) tramiteSolicitud.getSpnSeleccionarConsiderando().getValue() - 1;
        String anotacion = tramiteSolicitud.getAreaTextModificarConsiderando().getText();
        solicitud.getConsiderandos().get(numeroConsiderando).setAnotacion(anotacion);
        DAOsolicitudes dao = new DAOsolicitudes();
        dao.actualizarSolicitud(solicitud);        
    }
    
    public void accionAgregarConsiderando()
    {
        int numeroConsiderando = solicitud.getConsiderandos().size() + 1;
        String anotacion = tramiteSolicitud.getAreaTextAgregarConsiderando().getText();
        Considerando considerando = new Considerando(numeroConsiderando, anotacion);
        solicitud.getConsiderandos().add(considerando);
        DAOsolicitudes dao = new DAOsolicitudes();
        dao.actualizarSolicitud(solicitud);    
    }
    
    public void accionEliminarConsiderando()
    {
        int numeroConsiderando = (Integer) tramiteSolicitud.getSpnSeleccionarConsiderando().getValue() - 1;
        solicitud.getConsiderandos().remove(numeroConsiderando);
        DAOsolicitudes dao = new DAOsolicitudes();
        dao.actualizarSolicitud(solicitud);    
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
