
package pe.crvm.pagoapp.prueba;

import pe.crvm.pagoapp.dto.PagoDto;
import pe.crvm.pagoapp.service.PagoService;



/**
 *
 * @author Carlos
 */
public class Prueba01 {
    public static void main(String[] args) {
        // Dato
    PagoDto dto = new PagoDto();
    dto.setHorasDia(6);
    dto.setDias(20);
    dto.setPagoHora(140);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    // Reporte
        System.out.println("Ingresos: "+dto.getIngresos());
        System.out.println("Renta: "+dto.getRenta());
        System.out.println("Neto: "+dto.getNeto());
    
    }
    
    
}
