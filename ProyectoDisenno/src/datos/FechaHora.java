package datos;

import java.sql.Time;
import java.sql.Date;

public class FechaHora 
{
    private Date date;     
    private Time time; 

    public FechaHora(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {        
        this.time = time;
    }
    
    public int compareTo(FechaHora fechaHora)
    {
        if (this.date.compareTo(fechaHora.getDate()) == 0)
        {
            if(this.time.compareTo(fechaHora.getTime()) == 0)
                return 0;
        }
        return 1; 
    }            
}
