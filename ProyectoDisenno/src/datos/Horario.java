package datos;

public class Horario {
        
    private FechaHorarios PrimeraFecha;
    private FechaHorarios SegundaFecha; 

    public Horario(FechaHorarios PrimeraFecha, FechaHorarios SegundaFecha) {
        this.PrimeraFecha = PrimeraFecha;
        this.SegundaFecha = SegundaFecha;
    }

    public FechaHorarios getPrimeraFecha() {
        return PrimeraFecha;
    }

    public void setPrimeraFecha(FechaHorarios PrimeraFecha) {
        this.PrimeraFecha = PrimeraFecha;
    }

    public FechaHorarios getSegundaFecha() {
        return SegundaFecha;
    }

    public void setSegundaFecha(FechaHorarios SegundaFecha) {
        this.SegundaFecha = SegundaFecha;
    }           
}