package datos;

import java.io.Serializable;

public class Considerando implements Serializable{
    
    public int Codigo; 
    public String Anotacion;

    public Considerando(int Codigo, String Anotacion) {
        this.Codigo = Codigo;
        this.Anotacion = Anotacion;
    }
        
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getAnotacion() {
        return Anotacion;
    }

    public void setAnotacion(String Anotacion) {
        this.Anotacion = Anotacion;
    }           
}
