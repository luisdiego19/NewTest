/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.dao.DAOsolicitudes;
import controlador.dto.DTOResolucion;
import controlador.ui.uiTramiteSolicitud;
import datos.Considerando;
import datos.DTOSolicitud;
import gui.TramiteSolicitud;
/**
 *
 * @author Giova
 */
public class Controlador {
    private TramiteSolicitud tramiteSolicitud;
    private DTOSolicitud solicitud;
    public Controlador()
    {
      
    }
    public void generarDocumento(DTOResolucion resolucion, int type)
    {
        
        if(type == 1)
        {
            GeneradorPDF generador = new GeneradorPDF();
            generador.generarDocumento(resolucion);
        }
        else
        {
            GeneradorHTML generador = new GeneradorHTML();
            generador.generarDocumento(resolucion);
        }
    }

    
    public void accionModificarConsiderando(DTOSolicitud solicitud, int numeroConsiderando, String anotacion)
    {        
        solicitud.getConsiderandos().get(numeroConsiderando).setAnotacion(anotacion);
        DAOsolicitudes dao = new DAOsolicitudes();
        dao.actualizarSolicitud(solicitud);        
    }
    
    public void accionAgregarConsiderando()
    {
        
    }
    
    public void accionEliminarConsiderando()
    {
     
    }

    /**
     * @return the tramiteSolicitud
     */
    public TramiteSolicitud getTramiteSolicitud() {
        return tramiteSolicitud;
    }

    /**
     * @param tramiteSolicitud the tramiteSolicitud to set
     */
    public void setTramiteSolicitud(TramiteSolicitud tramiteSolicitud) {
        this.tramiteSolicitud = tramiteSolicitud;
    }

    /**
     * @return the solicitud
     */
    public DTOSolicitud getSolicitud() {
        return solicitud;
    }

    /**
     * @param solicitud the solicitud to set
     */
    public void setSolicitud(DTOSolicitud solicitud) {
        this.solicitud = solicitud;
    }
}
