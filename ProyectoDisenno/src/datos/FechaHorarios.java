package datos;

import java.sql.Time;
import java.util.Date;

public class FechaHorarios 
{
    private Date Fecha;
    private Time HoraInicio; 
    private Time HoraFinal;

    public FechaHorarios(Date Fecha, Time HoraInicio, Time HoraFinal) {
        this.Fecha = Fecha;
        this.HoraInicio = HoraInicio;
        this.HoraFinal = HoraFinal;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Time getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Time HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public Time getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(Time HoraFinal) {
        this.HoraFinal = HoraFinal;
    }
            
}
