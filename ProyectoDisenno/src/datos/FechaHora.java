package datos;

import java.util.Date;

public class FechaHora 
{
    private Date date;     
    private String time; 

    public FechaHora(Date date, String time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {        
        this.time = time;
    }
    
    public int compareTo(FechaHora fechaHora)
    {
        if (this.date.compareTo(fechaHora.getDate()) == 0)
        {
            if(this.time.equals(fechaHora.getTime()))
                return 0;
        }
        return 1; 
    }            
}
