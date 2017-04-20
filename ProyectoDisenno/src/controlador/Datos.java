package controlador;

import datos.DTOSolicitud;
import java.util.ArrayList;

public class Datos 
{
    
    private ArrayList<DTOSolicitud> solicitudes;
    private static Datos instance; 
    
    private Datos()
    {
        
    }
    
    public static Datos getInstance()
    {
        if(instance == null)
            instance = new Datos();
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
