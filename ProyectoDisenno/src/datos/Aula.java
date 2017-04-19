package datos;


public class Aula {
    
    private String Codigo; 
    private int Numero; 

    public Aula(String Codigo, int Numero) {
        this.Codigo = Codigo;
        this.Numero = Numero;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }            
}
