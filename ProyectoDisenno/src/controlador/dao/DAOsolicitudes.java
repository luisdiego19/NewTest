package controlador.dao;

import controlador.ConfigurationPaths;
import datos.Solicitud;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DAOsolicitudes {
    
    public void actualizarSolicitud(Solicitud solicitudActualizar)
    {
       
        try{
        FileInputStream fileInputStream = new FileInputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);   
        long pointerPosition = 0;
        boolean cont = true;
        while(cont)
        {
            pointerPosition = fileInputStream.getChannel().position(); 
            Solicitud solicitud = (Solicitud)objectInputStream.readObject();                                
            if(solicitud.getFecha().compareTo(solicitudActualizar.getFecha()) == 0) 
            {           
                cont = false; 
            }            
        }                
        
        FileOutputStream fileOutputStream = new FileOutputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
        fileOutputStream.getChannel().position(pointerPosition);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(solicitudActualizar);
        
        fileOutputStream.close();
        objectOutputStream.close();
        fileInputStream.close();
        objectInputStream.close();
        
        } catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        
    }         
}
