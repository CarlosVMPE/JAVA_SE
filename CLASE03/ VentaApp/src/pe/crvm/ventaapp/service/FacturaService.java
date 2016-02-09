
package pe.crvm.ventaapp.service;

import pe.crvm.ventaapp.dto.ItemDto;

/**
 *
 * @author Alumno
 */
public class FacturaService extends ComprobanteAbstract{

    @Override
    public ItemDto[] procesar(double total) {
        // Variables
        double consumo, impuesto, servicio, totalGeneral;
        // Proceso
        consumo = total /(1+IGV);  // total = consumo * 1.18 
        impuesto = total - consumo;
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        // Reporte
                    /** Para la Factura **/
        ItemDto[] repo = {
            new ItemDto("Consumo", consumo),
            new ItemDto("Impuesto", impuesto),
            new ItemDto("Total", total),
            new ItemDto("Servicio", servicio),
            new ItemDto("Total General", totalGeneral),
        
        };
        
        return repo;
        
    }
    
}
