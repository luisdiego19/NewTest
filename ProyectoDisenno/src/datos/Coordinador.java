package datos;


public class Coordinador extends Solicitante {
    
    public Coordinador(String Identificacion, String Nombre, String Apellidos, String Correo, String Telefono) {
        super(Identificacion, Nombre, Apellidos, Correo, Telefono);
    }
    
    public void verSolicitud(int codigoSolicitud)
    {
        
    }
    
    public void agregarAnotacion(Solicitud solicitud)
    {
        
    }
    
    public int tramitarSolicitud(Solicitud solicitud)
    {
        return 0; 
        
    }        
}
