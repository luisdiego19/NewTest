package datos;

import java.io.Serializable;

public class Curso implements Serializable {
    
    public String codigoCurso;
    public String nombreCurso; 
    public CreditosEnum creditos;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Curso(String codigoCurso, String nombreCurso, CreditosEnum creditos) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }           

    public CreditosEnum getCreditos() {
        return creditos;
    }

    public void setCreditos(CreditosEnum creditos) {
        this.creditos = creditos;
    }
        
}
