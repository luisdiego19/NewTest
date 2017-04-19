package datos;

import java.util.Date;

public class Solicitud {
    
    private Date Fecha; 
    private String Identificacion; 
    private Periodo periodo;
    private Grupo grupo; 
    private Estudiante estudiante; 
    private InconsistenciaEnum inconsistencia; 
    private String Detalles; 
    private Object Adjuntos; 
    private EstadoEnum Estado; 
    
    

    public Solicitud(Date Fecha, String Identificacion, Periodo periodo, Grupo grupo, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, Object Adjuntos, EstadoEnum Estado) {        
        this.Fecha = Fecha;
        this.Identificacion = Identificacion;
        this.periodo = periodo;
        this.grupo = grupo;
        this.estudiante = estudiante;
        this.inconsistencia = inconsistencia;
        this.Detalles = Detalles;
        this.Adjuntos = Adjuntos;
        this.Estado = Estado;
    }
        
    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public InconsistenciaEnum getInconsistencia() {
        return inconsistencia;
    }

    public void setInconsistencia(InconsistenciaEnum inconsistencia) {
        this.inconsistencia = inconsistencia;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public Object getAdjuntos() {
        return Adjuntos;
    }

    public void setAdjuntos(Object Adjuntos) {
        this.Adjuntos = Adjuntos;
    }

    public EstadoEnum getEstado() {
        return Estado;
    }

    public void setEstado(EstadoEnum Estado) {
        this.Estado = Estado;
    }                   
}
