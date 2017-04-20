/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dto;

import java.util.ArrayList;

/**
 *
 * @author Giova
 */
public class DTOResolucion {
    private String fecha;
    private String directorCarrera;
    private String idSolicitud;
    private int numeroResolucion;
    private String iDcurso;
    private String nombreCurso;
    private int grupoCurso;
    private String nombreEstudiante;
    private String carneEstudiante;
    private String periodo;
    private String resultado;
    private ArrayList<String> considerados;
    private String resolucion;
    private String tipoCaso;
    private String profesor;
    private int anno;
    private String directorAdmision;
    
    public DTOResolucion(String pFecha,String pDirector,String pTipoCaso,String pProfesor,int pAnno,String pIdSol,int pNumeroRes, String pIdCurso,String pNombreCurso, int pGrupo, 
            String pEstudiante, String pCarne, String pPeriodo,String pResultado, ArrayList<String> pConsiderados,String pResolucion,String pDirectorAdmision) {
        this.fecha = pFecha;
        this.directorCarrera = pDirector;
        this.idSolicitud = pIdSol;
        this.tipoCaso = pTipoCaso;
        this.numeroResolucion = pNumeroRes;
        this.iDcurso = pIdCurso;
        this.nombreCurso = pNombreCurso;
        this.grupoCurso = pGrupo;
        this.nombreEstudiante = pEstudiante;
        this.carneEstudiante = pCarne;
        this.periodo = pPeriodo;
        this.considerados = pConsiderados;
        this.resultado = pResultado;
        this.resolucion = pResolucion;   
        this.profesor = pProfesor;
        this.anno = pAnno;
        this.directorAdmision = pDirectorAdmision;
    }   
    
    public  DTOResolucion()
    {}
    /**
     * @return the directorCarrera
     */
    
    public String getDirectorCarrera() {
        return directorCarrera;
    }

    /**
     * @param directorCarrera the directorCarrera to set
     */
    public void setDirectorCarrera(String directorCarrera) {
        this.directorCarrera = directorCarrera;
    }

    /**
     * @return the idSolicitud
     */
    public String getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * @param idSolicitud the idSolicitud to set
     */
    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    /**
     * @return the numeroResolucion
     */
    public int getNumeroResolucion() {
        return numeroResolucion;
    }

    /**
     * @param numeroResolucion the numeroResolucion to set
     */
    public void setNumeroResolucion(int numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    /**
     * @return the iDcurso
     */
    public String getiDcurso() {
        return iDcurso;
    }

    /**
     * @param iDcurso the iDcurso to set
     */
    public void setiDcurso(String iDcurso) {
        this.iDcurso = iDcurso;
    }

    /**
     * @return the nombreCurso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * @param nombreCurso the nombreCurso to set
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the grupoCurso
     */
    public int getGrupoCurso() {
        return grupoCurso;
    }

    /**
     * @param grupoCurso the grupoCurso to set
     */
    public void setGrupoCurso(int grupoCurso) {
        this.grupoCurso = grupoCurso;
    }

    /**
     * @return the nombreEstudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * @param nombreEstudiante the nombreEstudiante to set
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    /**
     * @return the carneEstudiante
     */
    public String getCarneEstudiante() {
        return carneEstudiante;
    }

    /**
     * @param carneEstudiante the carneEstudiante to set
     */
    public void setCarneEstudiante(String carneEstudiante) {
        this.carneEstudiante = carneEstudiante;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the considerados
     */
    public ArrayList<String> getConsiderados() {
        return considerados;
    }

    /**
     * @param considerados the considerados to set
     */
    public void setConsiderados(ArrayList<String> considerados) {
        this.considerados = considerados;
    }

    /**
     * @return the resolucion
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * @param resolucion the resolucion to set
     */
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipoCaso
     */
    public String getTipoCaso() {
        return tipoCaso;
    }
    public void setTipoCaso(String pTipo)
    {
        this.tipoCaso = pTipo;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the anno
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param anno the anno to set
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     * @return the directorAdmision
     */
    public String getDirectorAdmision() {
        return directorAdmision;
    }

    /**
     * @param directorAdmision the directorAdmision to set
     */
    public void setDirectorAdmision(String directorAdmision) {
        this.directorAdmision = directorAdmision;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
}
