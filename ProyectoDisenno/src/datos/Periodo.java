package datos;

import java.io.Serializable;
import java.util.Date;


public class Periodo implements Serializable{
    
    private int ID; 
    private String Nombre;
    private Date FechaInicio;
    private Date FechaFinal;

    
    public Periodo(String nombre)
    {
        this.Nombre = nombre;
    }
    
    
    public Periodo(int ID, String Nombre, Date FechaInicio, Date FechaFinal) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
    }
        
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }                       
}
