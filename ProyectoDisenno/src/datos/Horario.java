package datos;

import java.sql.Time;

public class Horario {
    
    private Time HoraInicio;
    private Time HoraFin;

    public Horario(Time HoraInicio, Time HoraFin) {
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
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
