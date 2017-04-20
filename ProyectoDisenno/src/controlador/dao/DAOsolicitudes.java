package controlador.dao;

import controlador.ConfigurationPaths;
import datos.DTOSolicitud;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import controlador.Datos;

public class DAOsolicitudes {

    public void actualizarSolicitud(DTOSolicitud solicitudActualizar) {
        ArrayList<DTOSolicitud> solicitudes = Datos.getInstance().getSolicitudes();
        ArrayList<DTOSolicitud> nueva = new ArrayList<>();
        for(DTOSolicitud solicitud: solicitudes)
        {
            if(! solicitud.getCodigo().equals(solicitudActualizar.getCodigo()))
                nueva.add(solicitud);
        }
        nueva.add(solicitudActualizar);
        try{
        salvarSolicitudesLocal(nueva);
        }catch (Exception ex)
        {
         System.out.println("Error " + ex.getMessage());   
        }
        Datos.getInstance().setSolicitudes(nueva);        
    }

    public void salvarSolicitudesLocal(ArrayList<DTOSolicitud> solicitudes) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (DTOSolicitud solicitud : solicitudes) {
            objectOutputStream.writeObject(solicitud);
        }     
        fileOutputStream.close();
        objectOutputStream.close();
    }
}
