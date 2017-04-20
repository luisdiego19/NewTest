
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.dto.DTOResolucion;

/**
 *
 * @author Giova
 */
public interface GeneradorStrategy {
    DTOResolucion resolucion = new DTOResolucion();
    
    public void generarDocumento(DTOResolucion resolucion);
}
