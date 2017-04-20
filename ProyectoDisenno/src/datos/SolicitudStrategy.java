package datos;


public interface SolicitudStrategy {
    
    // Es mejor cambiar los parámetros por un DTO
    public DTOSolicitud registrarSolicitud(Solicitante solicitante, 
            Periodo periodoLectivo,
            int codigoCurso,
            Estudiante estudiante, 
            InconsistenciaEnum inconsistencia, 
            String descripcion,
            Object evidencia
            );    
}
