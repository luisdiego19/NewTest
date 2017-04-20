package datos;

public class RealizarSolicitudDocente implements SolicitudStrategy {

    @Override
    public DTOSolicitud registrarSolicitud(Solicitante solicitante, Periodo periodoLectivo, int codigoCurso, Estudiante estudiante, InconsistenciaEnum inconsistencia, String descripcion, Object evidencia) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
