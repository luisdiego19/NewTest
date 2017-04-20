package controlador.dao;

import controlador.ConfigurationPaths;
import datos.Solicitud;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DAOsolicitudes {

    public void actualizarSolicitud(Solicitud solicitudActualizar) {
        try {
            FileInputStream fileInputStream = new FileInputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            long pointerPosition = 0;
            boolean cont = true;
            while (cont) {
                pointerPosition = fileInputStream.getChannel().position();
                Solicitud solicitud = (Solicitud) objectInputStream.readObject();
                if (solicitud.getCodigo().equals(solicitudActualizar.getCodigo())) {
                    cont = false;
                }
            }
             pointerPosition = 0;
            System.out.println(pointerPosition);
            
            FileOutputStream fileOutputStream = new FileOutputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
            fileOutputStream.getChannel().position(pointerPosition);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(solicitudActualizar);

            fileOutputStream.close();
            objectOutputStream.close();
            fileInputStream.close();
            objectInputStream.close();

        } catch (Exception ex) {
            System.out.println("DAOSolicitudes " + ex.getMessage());
        }

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
