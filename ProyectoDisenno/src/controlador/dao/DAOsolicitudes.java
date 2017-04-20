package controlador.dao;

import controlador.ConfigurationPaths;
import datos.Solicitud;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import controlador.Datos;

public class DAOsolicitudes {

    public void actualizarSolicitud(Solicitud solicitudActualizar) {
        ArrayList<Solicitud> solicitudes = Datos.getInstance().getSolicitudes();
        ArrayList<Solicitud> nueva = new ArrayList<>();
        for(Solicitud solicitud: solicitudes)
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

    public void salvarSolicitudesLocal(ArrayList<Solicitud> solicitudes) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (Solicitud solicitud : solicitudes) {
            objectOutputStream.writeObject(solicitud);
        }     
        fileOutputStream.close();
        objectOutputStream.close();
    }
}
