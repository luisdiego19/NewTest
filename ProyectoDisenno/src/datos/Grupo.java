package datos;

import java.io.Serializable;

public class Grupo implements Serializable {
    
    private int Codigo; 
    private int NumeroGrupo; 

    public Grupo(int NumeroGrupo) {
        this.NumeroGrupo = NumeroGrupo;
    }
   
    
    public Grupo(int Codigo, int NumeroGrupo) {
        this.Codigo = Codigo;
        this.NumeroGrupo = NumeroGrupo;
    }
        
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumeroGrupo() {
        return NumeroGrupo;
    }

    public void setNumeroGrupo(int NumeroGrupo) {
        this.NumeroGrupo = NumeroGrupo;
    }            
}
