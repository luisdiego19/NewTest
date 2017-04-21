package controlador;

import datos.DTOSolicitud;
import java.util.ArrayList;

public class DatosSolicitudes 
{
    
    private ArrayList<DTOSolicitud> solicitudes;
    private static DatosSolicitudes instance; 
    
    private DatosSolicitudes()
    {
        
    }
    
    public static DatosSolicitudes getInstance()
    {
        if(instance == null)
            instance = new DatosSolicitudes();
        return instance; 
    }
    

     public DTOSolicitud getSolicitudCodigo(String pCodigo)
     {
         for(DTOSolicitud solicitud: solicitudes)
         {
             if(solicitud.getCodigo().equals(pCodigo))
             {
                 return solicitud;
             }
         }
         System.out.println("Error");
         return null;
     }
    
    public ArrayList<DTOSolicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<DTOSolicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }                        
}
