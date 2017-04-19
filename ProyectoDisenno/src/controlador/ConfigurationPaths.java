package controlador;


public class ConfigurationPaths {
    
   private ConfigurationPaths configurationPaths; 
    
   private String pathSolicitudesLocal;
   private String pathGoogleDriveExcel;
   private String formatoGoogleFriveExcel;
   private String pathCarteraDocentes;
   private String pathCursos;
   private String pathOfertaAcademica; 
    
   private String directorEscuelaComputacion; 
   private String directorAdminisionRegistro;

    private ConfigurationPaths()
    {
        
    }
     
    private ConfigurationPaths(String pathSolicitudesLocal, String pathGoogleDriveExcel, String formatoGoogleFriveExcel, String pathCarteraDocentes, String pathCursos, String pathOfertaAcademica, String directorEscuelaComputacion, String directorAdminisionRegistro)
    {
        this.pathSolicitudesLocal = pathSolicitudesLocal;
        this.pathGoogleDriveExcel = pathGoogleDriveExcel;
        this.formatoGoogleFriveExcel = formatoGoogleFriveExcel;
        this.pathCarteraDocentes = pathCarteraDocentes;
        this.pathCursos = pathCursos;
        this.pathOfertaAcademica = pathOfertaAcademica;
        this.directorEscuelaComputacion = directorEscuelaComputacion;
        this.directorAdminisionRegistro = directorAdminisionRegistro;
    }

    public ConfigurationPaths getInstance()
    {
        if(configurationPaths == null)
        {
            configurationPaths = new ConfigurationPaths();
        } 
        return configurationPaths;         
    }
    
    public String getPathSolicitudesLocal() {
        return pathSolicitudesLocal;
    }

    public void setPathSolicitudesLocal(String pathSolicitudesLocal) {
        this.pathSolicitudesLocal = pathSolicitudesLocal;
    }

    public String getPathGoogleDriveExcel() {
        return pathGoogleDriveExcel;
    }

    public void setPathGoogleDriveExcel(String pathGoogleDriveExcel) {
        this.pathGoogleDriveExcel = pathGoogleDriveExcel;
    }

    public String getFormatoGoogleFriveExcel() {
        return formatoGoogleFriveExcel;
    }

    public void setFormatoGoogleFriveExcel(String formatoGoogleFriveExcel) {
        this.formatoGoogleFriveExcel = formatoGoogleFriveExcel;
    }

    public String getPathCarteraDocentes() {
        return pathCarteraDocentes;
    }

    public void setPathCarteraDocentes(String pathCarteraDocentes) {
        this.pathCarteraDocentes = pathCarteraDocentes;
    }

    public String getPathCursos() {
        return pathCursos;
    }

    public void setPathCursos(String pathCursos) {
        this.pathCursos = pathCursos;
    }

    public String getPathOfertaAcademica() {
        return pathOfertaAcademica;
    }

    public void setPathOfertaAcademica(String pathOfertaAcademica) {
        this.pathOfertaAcademica = pathOfertaAcademica;
    }

    public String getDirectorEscuelaComputacion() {
        return directorEscuelaComputacion;
    }

    public void setDirectorEscuelaComputacion(String directorEscuelaComputacion) {
        this.directorEscuelaComputacion = directorEscuelaComputacion;
    }

    public String getDirectorAdminisionRegistro() {
        return directorAdminisionRegistro;
    }

    public void setDirectorAdminisionRegistro(String directorAdminisionRegistro) {
        this.directorAdminisionRegistro = directorAdminisionRegistro;
    }         
    
}
