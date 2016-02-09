
package pe.crvm.ventaapp.service;

import pe.crvm.ventaapp.dto.ItemDto;

/**
 *
 * @author Alumno
 */
public abstract class ComprobanteAbstract {
    
    protected final double IGV = 0.18; 
    protected final double SERVICIO = 0.10;
    
    public abstract ItemDto[] procesar(double total);
}
