package controlador.dto;

public class DTOofertaAcademica {
    
    // CODIGO, NOMBRE, NUMERO_GRUPO, ID_PROFESOR_ NOMBRE, HORARIO, AULA
   //    CURSO,         INT,               DOCENTE,   HORARIO   ,AULA
    
    private String codigo;
    private String nombre;
    private String numeroGrupo; 
    private String idProfesor;
    private String nombreProfesor; 
    private String primeraFechaHora;
    private String segundaFechaHora;
    private String aula; 

    public DTOofertaAcademica(String codigo, String nombre, String numeroGrupo, String idProfesor, String nombreProfesor, String primeraFechaHora, String segundaFechaHora, String aula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroGrupo = numeroGrupo;
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.primeraFechaHora = primeraFechaHora;
        this.segundaFechaHora = segundaFechaHora;
        this.aula = aula;
    }
        
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(String numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getPrimeraFechaHora() {
        return primeraFechaHora;
    }

    public void setPrimeraFechaHora(String primeraFechaHora) {
        this.primeraFechaHora = primeraFechaHora;
    }

    public String getSegundaFechaHora() {
        return segundaFechaHora;
    }

    public void setSegundaFechaHora(String segundaFechaHora) {
        this.segundaFechaHora = segundaFechaHora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
}
