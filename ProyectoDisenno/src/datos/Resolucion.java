package datos;

public class Resolucion {
    
    public int Codigo; 
    public String NotaAclaratoria; 

    public Resolucion(int Codigo, String NotaAclaratoria) {
        this.Codigo = Codigo;
        this.NotaAclaratoria = NotaAclaratoria;
    }
            
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNotaAclaratoria() {
        return NotaAclaratoria;
    }

    public void setNotaAclaratoria(String NotaAclaratoria) {
        this.NotaAclaratoria = NotaAclaratoria;
    }           
}
