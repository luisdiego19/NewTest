package controlador;

import datos.Solicitud;
import java.util.ArrayList;

public class Datos 
{
    
    private ArrayList<Solicitud> solicitudes;
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
    

     public Solicitud getSolicitudCodigo(String pCodigo)
     {
         for(Solicitud solicitud: solicitudes)
         {
             if(solicitud.getCodigo().equals(pCodigo))
             {
                 return solicitud;
             }
         }
         System.out.println("Error");
         return null;
     }
    
    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }                        
}
