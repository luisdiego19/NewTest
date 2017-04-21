package controlador.gestor;

import java.util.ArrayList;

// INTENCION -> Organizar y Reemplazar DataLoader 

public abstract class GestorGeneral {
    
    private ArrayList<Object> listObjetos; 
    
    public abstract boolean agregar(Object object);
    public abstract boolean consultar(Object object);
    public abstract boolean modificar(Object object);
    public abstract boolean eliminar(Object object);
    public abstract ArrayList cargarDatos();

    public ArrayList<Object> getListObjetos() {
        return listObjetos;
    }

    public void setListObjetos(ArrayList<Object> listObjetos) {
        this.listObjetos = listObjetos;
    }                
}
