package test;

import com.my.GoogleForms;
import controlador.ConfigurationPaths;
import controlador.DataLoader;
import controlador.dao.DAOsolicitudes;
import datos.Curso;
import datos.EstadoEnum;
import datos.Estudiante;
import datos.FechaHora;
import datos.Grupo;
import datos.InconsistenciaEnum;
import datos.Periodo;
import datos.DTOSolicitud;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testGoogle {
    
    public static void main(String args[])
    {
        DataLoader loader = new DataLoader();
        loader.cargarPrimerosDatos();
        /*
        ArrayList<Solicitud> test = cargarSolicitudesGoogle(); 
        DAOsolicitudes dao = new DAOsolicitudes();
        try{
        dao.salvarSolicitudesLocal(test);
        } catch(IOException ex)
        {
            System.out.println("Error " + ex.getLocalizedMessage());
        }*/
        try{
        ArrayList<DTOSolicitud> nuevas = loader.cargaInicialSolicitudes();
        for(DTOSolicitud solicitud: nuevas)
        {
            System.out.println(solicitud.getCodigo());
        }        
        nuevas.get(0).setNombreSolicitante("Fulano");
        DAOsolicitudes dao = new DAOsolicitudes(); 
        dao.salvarSolicitudesLocal(nuevas);
        
        ArrayList<DTOSolicitud> nuevas3 = loader.cargaInicialSolicitudes();
        for(DTOSolicitud solicitud: nuevas3)
        {
            System.out.println(solicitud.getNombreSolicitante());
        }     
        } catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public static ArrayList<DTOSolicitud> cargarSolicitudesGoogle() {
        String hojaID = "1aUZUKRCIfhH-pO8iTeyN30kZmByrVyOthv9-N5arUjE";
        String hojaFormato = "Sheet1!A2:L";
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
                    String idSolicitante = String.valueOf(row.get(2));
                    String nombreSolicitante = String.valueOf(row.get(3));
                    String carnetEstudiante = String.valueOf(row.get(4));
                    String nombreEstudiante = String.valueOf(row.get(5));
                    String correoEstudiante = String.valueOf(row.get(5));
                    String numeroEstudiante = String.valueOf(row.get(6));
                    Estudiante estudiante = new Estudiante(" ", nombreEstudiante, " ", correoEstudiante, numeroEstudiante, Integer.parseInt(carnetEstudiante));
                    String periodoNombre = String.valueOf(row.get(7));
                    Periodo periodo = new Periodo(periodoNombre);
                    String cursoNombre = String.valueOf(row.get(8));
                    Curso curso = new Curso(cursoNombre);
                    int numeroGrupo = Integer.parseInt(String.valueOf(row.get(9)));
                    Grupo grupo = new Grupo(numeroGrupo);
                    InconsistenciaEnum inconsistencia = InconsistenciaEnum.valueOf(String.valueOf(row.get(10)));
                    String detallesInconsistencia = String.valueOf(row.get(11));
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
