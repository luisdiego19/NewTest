package datos;


public class Estudiante extends Solicitante {
    
    private int carnet;
    
    public Estudiante(String Identificacion, String Nombre, String Apellidos, String Correo, String Telefono, int Carnet) {
        super(Identificacion, Nombre, Apellidos, Correo, Telefono);
        this.carnet = Carnet;         
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }            
}
