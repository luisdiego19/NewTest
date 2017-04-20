package datos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Solicitud implements Serializable {
    
    private Date Fecha; 
    private String Identificacion; 
    private String nombreSolicitante; 
    private Periodo periodo;
    private Grupo grupo; 
    private Curso curso; 
    private Estudiante estudiante; 
    private InconsistenciaEnum inconsistencia; 
    private String Detalles; 
    private Object Adjuntos; 
    private EstadoEnum Estado; 
    private ArrayList<Considerando> considerandos; 

    public Solicitud(Date Fecha, String Identificacion, String nombreSolicitante, Periodo periodo, Grupo grupo, Curso curso, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, Object Adjuntos, EstadoEnum Estado, ArrayList<Considerando> considerandos) {
        this.Fecha = Fecha;
        this.Identificacion = Identificacion;
        this.nombreSolicitante = nombreSolicitante;
        this.periodo = periodo;
        this.grupo = grupo;
        this.curso = curso;
        this.estudiante = estudiante;
        this.inconsistencia = inconsistencia;
        this.Detalles = Detalles;
        this.Adjuntos = Adjuntos;
        this.Estado = Estado;
        this.considerandos = considerandos;
    }
            
    public Solicitud(Date Fecha, String Identificacion, String nombreSolicitante, Periodo periodo, Grupo grupo, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, Object Adjuntos, EstadoEnum Estado, ArrayList<Considerando> considerandos) {
        this.Fecha = Fecha;
        this.Identificacion = Identificacion;
        this.nombreSolicitante = nombreSolicitante;
        this.periodo = periodo;
        this.grupo = grupo;
        this.estudiante = estudiante;
        this.inconsistencia = inconsistencia;
        this.Detalles = Detalles;
        this.Adjuntos = Adjuntos;
        this.Estado = Estado;
        this.considerandos = considerandos;
    }
               
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

    public Solicitud(Date Fecha, String Identificacion, Periodo periodo, Grupo grupo, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, Object Adjuntos, EstadoEnum Estado, ArrayList<Considerando> considerandos) {
        this.Fecha = Fecha;
        this.Identificacion = Identificacion;
        this.periodo = periodo;
        this.grupo = grupo;
        this.estudiante = estudiante;
        this.inconsistencia = inconsistencia;
        this.Detalles = Detalles;
        this.Adjuntos = Adjuntos;
        this.Estado = Estado;
        this.considerandos = considerandos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
            
    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }
           
    public ArrayList<Considerando> getConsiderandos() {
        return considerandos;
    }

    public void setConsiderandos(ArrayList<Considerando> considerandos) {
        this.considerandos = considerandos;
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
