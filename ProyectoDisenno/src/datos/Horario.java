package datos;

import java.sql.Time;
import java.util.Date;

public class Horario {
    
    private Date PrimeraFecha;
    private Date SegundaFecha;   
    private Time HoraInicio;
    private Time HoraFin;
    
    public Horario(Date PrimeraFecha, Date SegundaFecha, Time HoraInicio, Time HoraFin) {
        this.PrimeraFecha = PrimeraFecha;
        this.SegundaFecha = SegundaFecha;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
    }

    public Horario(Time HoraInicio, Time HoraFin) {
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
    }   

    public Date getPrimeraFecha() {
        return PrimeraFecha;
    }

    public void setPrimeraFecha(Date PrimeraFecha) {
        this.PrimeraFecha = PrimeraFecha;
    }

    public Date getSegundaFecha() {
        return SegundaFecha;
    }

    public void setSegundaFecha(Date SegundaFecha) {
        this.SegundaFecha = SegundaFecha;
    }
           
    public Time getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Time HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public Time getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(Time HoraFin) {
        this.HoraFin = HoraFin;
    }            
}
