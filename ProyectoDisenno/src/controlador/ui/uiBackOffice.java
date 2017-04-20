package controlador.ui;

import controlador.dao.DAOsolicitudes;
import datos.Curso;
import datos.DTOSolicitud;
import datos.EstadoEnum;
import datos.Estudiante;
import datos.FechaHora;
import datos.Grupo;
import datos.InconsistenciaEnum;
import datos.Periodo;
import gui.BackOffice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class uiBackOffice 
{
    private BackOffice backOffice; 

    public uiBackOffice(BackOffice backOffice) {
        this.backOffice = backOffice;
    }
    
    public void accionAgregarSolicitud()
    {
       try{
       String fechaExcel =  backOffice.getTxtSolFecha().getText();
       String fecha = fechaExcel.split("\\s+")[0];
                    String tiempo = fechaExcel.split("\\s+")[1];                    
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaDate = (Date) df.parse(fecha);
                    FechaHora fechaHora = new FechaHora(fechaDate, tiempo);
       String idSolicitante = backOffice.getTxtSolID().getText();
       String nombreSolicitante = backOffice.getTxtSolNombre().getText();
       String periodo = backOffice.getTxtSolPeriodo().getText();
       String numeroGrupo = backOffice.getTxtSolGrupo().getText();
       String cursoNombre = backOffice.getTxtSolCurso().getText();
       String inconsistencia = backOffice.getComboSolInconsistencia().getSelectedItem().toString();
       
       String carnetEstudiante = backOffice.getTxtEstCarnet().getText();
       String nombreEstudiante = backOffice.getTxtEstNombre().getText();
       String correoEstudiante = backOffice.getTxtEstCorreo().getText();
       String numeroEstudiante = backOffice.getjTextField10().getText();
       
       String detalles = backOffice.getAreaTextDetalles().getText(); 
       
       Estudiante estudiante = new Estudiante(" ", nombreEstudiante, " ", correoEstudiante, numeroEstudiante, Integer.parseInt(carnetEstudiante));
       Periodo pPeriodo = new Periodo(periodo);
       Curso curso = new Curso(cursoNombre);
       Grupo grupo = new Grupo(Integer.parseInt(numeroGrupo));
       InconsistenciaEnum inconsistenciaEnum = InconsistenciaEnum.valueOf(String.valueOf(inconsistencia));
       DTOSolicitud solicitud = new DTOSolicitud(fechaHora, idSolicitante, nombreSolicitante, pPeriodo, grupo, curso, estudiante, inconsistenciaEnum,
                            detalles, EstadoEnum.PENDIENTE
                    );
                    solicitud.setCodigo(solicitud.generarCodigo());
        DAOsolicitudes dao = new DAOsolicitudes();
        dao.actualizarSolicitud(solicitud);
       }catch(Exception ex)
       {
           
       }
    }
    
}
