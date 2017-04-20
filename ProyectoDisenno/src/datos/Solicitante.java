package datos;

import java.io.Serializable;


public class Solicitante implements Serializable {
    
    private String Identificacion;
    private String Nombre;
    private String Apellidos;
    private String Correo;
    private String Telefono; 

    public Solicitante(String Identificacion, String Nombre, String Apellidos, String Correo, String Telefono) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }
           
    public DTOSolicitud registrarSolicitud( 
            Periodo periodoLectivo,
            int codigoCurso,
            Estudiante estudiante, 
            InconsistenciaEnum inconsistencia, 
            String descripcion,
            Object evidencia
            )
    {               
        SolicitudStrategy strategy = null;
        return strategy.registrarSolicitud(this, periodoLectivo, codigoCurso, estudiante, inconsistencia, descripcion, evidencia);
    }
    
    
    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
                 
}
