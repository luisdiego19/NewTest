package datos;

import java.io.Serializable;
import java.util.ArrayList;

public class DTOSolicitud implements Serializable {
    
    private String Codigo;
    private FechaHora Fecha; 
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

    public DTOSolicitud(FechaHora Fecha, String Identificacion, String nombreSolicitante, Periodo periodo, Grupo grupo, Curso curso, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, EstadoEnum Estado) {
        this.Fecha = Fecha;
        this.Identificacion = Identificacion;
        this.nombreSolicitante = nombreSolicitante;
        this.periodo = periodo;
        this.grupo = grupo;
        this.curso = curso;
        this.estudiante = estudiante;
        this.inconsistencia = inconsistencia;
        this.Detalles = Detalles;
        this.Estado = Estado;
        this.considerandos = new ArrayList<>();
    }
            
    public DTOSolicitud(String Codigo, FechaHora Fecha, String Identificacion, String nombreSolicitante, Periodo periodo, Grupo grupo, Curso curso, Estudiante estudiante, InconsistenciaEnum inconsistencia, String Detalles, Object Adjuntos, EstadoEnum Estado, ArrayList<Considerando> considerandos) {
        this.Codigo = Codigo;
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

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String generarCodigo()
    {
        String uno = Fecha.getTime().split(":")[0];
        String dos = Fecha.getTime().split(":")[1];
        String tres = Fecha.getTime().split(":")[2];
        String milis = String.valueOf(Fecha.getDate().getTime());
        return milis+uno+dos+tres;                
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
    
    public FechaHora getFecha() {
        return Fecha;
    }

    public void setFecha(FechaHora Fecha) {
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

    @Override
    public String toString() {
        return "Solicitud{" + "Codigo=" + Codigo + ", Fecha=" + Fecha + ", Identificacion=" + Identificacion + ", nombreSolicitante=" + nombreSolicitante + ", periodo=" + periodo + ", grupo=" + grupo + ", curso=" + curso + ", estudiante=" + estudiante + ", inconsistencia=" + inconsistencia + ", Detalles=" + Detalles + ", Adjuntos=" + Adjuntos + ", Estado=" + Estado + ", considerandos=" + considerandos + '}';
    }
    
    
    
}
