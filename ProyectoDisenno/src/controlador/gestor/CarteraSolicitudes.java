package controlador.gestor;

import com.my.GoogleForms;
import controlador.ConfigurationPaths;
import controlador.dao.DAOsolicitudes;
import datos.Curso;
import datos.DTOSolicitud;
import datos.EstadoEnum;
import datos.Estudiante;
import datos.FechaHora;
import datos.Grupo;
import datos.InconsistenciaEnum;
import datos.Periodo;
import datos.Solicitud;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarteraSolicitudes extends GestorGeneral {

    @Override
    public boolean agregar(Object object) {
       DAOsolicitudes dao = new DAOsolicitudes();
       dao.actualizarSolicitud((DTOSolicitud)object);
       return true; 
    }

    @Override
    public boolean consultar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object object) {
       DAOsolicitudes dao = new DAOsolicitudes();
       dao.actualizarSolicitud((DTOSolicitud)object);
       return true; 
    }

    @Override
    public boolean eliminar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList cargarDatos() {
         try {
            ArrayList<DTOSolicitud> solicitudesLocales = new ArrayList<>(); 
            try{
            FileInputStream fileInputStream = new FileInputStream(ConfigurationPaths.getInstance().getPathSolicitudesLocal());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);                       
            boolean cont = true;
            while (cont) {
                try{
                DTOSolicitud solicitud = (DTOSolicitud) objectInputStream.readObject();
                
                if (solicitud != null) {
                    solicitudesLocales.add(solicitud);
                } else {
                    cont = false;
                }
                }catch(Exception ex)
                {
                    break;
                }                
            }
                                    
            fileInputStream.close();
            objectInputStream.close();
            } catch(Exception ex)
            {
                
            }
            ArrayList<DTOSolicitud> solicitudesNuevas = cargarSolicitudesGoogle();            
            for (DTOSolicitud solicitudGoogle : solicitudesNuevas) {                
                boolean existe = false;
                for (DTOSolicitud solicitudLocal : solicitudesLocales) {
                    if (solicitudLocal.getCodigo().equals(solicitudGoogle.getCodigo())) {
                        existe = true;
                    }
                }
                if (!existe) {
                    solicitudesLocales.add(solicitudGoogle);
                } 
            } 
                                    
            DAOsolicitudes dao = new DAOsolicitudes();
            dao.salvarSolicitudesLocal(solicitudesLocales);
            return solicitudesLocales;
        } catch (Exception ex) {
            System.out.println("Data Loader " + ex.getMessage());
            return null;
        }
    }
            
    private ArrayList<DTOSolicitud> cargarSolicitudesGoogle() {
                
        String hojaID = ConfigurationPaths.getInstance().getPathGoogleDriveExcel();
        String hojaFormato = ConfigurationPaths.getInstance().getFormatoGoogleDriveExcel();
         GoogleForms forms = new GoogleForms(hojaID, hojaFormato, "APP");         
        List<List<Object>> values = forms.getResponse().getValues();
        ArrayList<DTOSolicitud> solicitudes = new ArrayList<>();
        
        if (values == null || values.size() == 0) {
            System.out.println("No data found.");
        } else {
            values.forEach((row) -> {
                try {
                    String fechaExcel = String.valueOf(row.get(0));//.replace("/", "-");   
                    String fecha = fechaExcel.split("\\s+")[0];
                    String tiempo = fechaExcel.split("\\s+")[1];                    
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaDate = (Date) df.parse(fecha);
                    FechaHora fechaHora = new FechaHora(fechaDate, tiempo);
                    String idSolicitante = String.valueOf(row.get(1));
                    String nombreSolicitante = String.valueOf(row.get(2));
                    String carnetEstudiante = String.valueOf(row.get(3));
                    String nombreEstudiante = String.valueOf(row.get(2));
                    String correoEstudiante = String.valueOf(row.get(4));
                    String numeroEstudiante = String.valueOf(row.get(5));
                    
                    Estudiante estudiante = new Estudiante(" ", nombreEstudiante, " ", correoEstudiante, numeroEstudiante, Integer.parseInt(carnetEstudiante));
                    String periodoNombre = String.valueOf(row.get(6));
                    Periodo periodo = new Periodo(periodoNombre);
                    String cursoNombre = String.valueOf(row.get(7));
                    Curso curso = new Curso(cursoNombre);
                    int numeroGrupo = Integer.parseInt(String.valueOf(row.get(8)));
                    Grupo grupo = new Grupo(numeroGrupo);
                    
                    InconsistenciaEnum inconsistencia = InconsistenciaEnum.valueOf(String.valueOf(row.get(9)));
                    String detallesInconsistencia = String.valueOf(row.get(10));
                    DTOSolicitud solicitud = new DTOSolicitud(fechaHora, idSolicitante, nombreSolicitante, periodo, grupo, curso, estudiante, inconsistencia,
                            detallesInconsistencia, EstadoEnum.PENDIENTE
                    );
                    solicitud.setCodigo(solicitud.generarCodigo());
                    solicitudes.add(solicitud);

                } catch (Exception ex) {
                   System.out.println("Google " + ex.getMessage());
                }
            });
        }
        return solicitudes;
    }
    
}
