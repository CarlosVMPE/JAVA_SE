
package pe.crvm.ventaapp.controller;

import pe.crvm.ventaapp.dto.ItemDto;
import pe.crvm.ventaapp.service.ComprobanteFactory;

/**
 *
 * @author Alumno
 */
public class VentaController {
    public String [] obtenerTipos(){
        String tipos[] = {ComprobanteFactory.COMP_FACTURA, ComprobanteFactory.COMP_BOLETA};
        
        return tipos;
    }
    
    public ItemDto[] procesar(String tipo, double total){
        return ComprobanteFactory.obtenerComp(tipo).procesar(total);
    }
}
