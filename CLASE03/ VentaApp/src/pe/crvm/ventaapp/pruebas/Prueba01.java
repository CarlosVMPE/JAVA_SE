
package pe.crvm.ventaapp.pruebas;

import pe.crvm.ventaapp.dto.ItemDto;
import pe.crvm.ventaapp.service.BoletaService;
import pe.crvm.ventaapp.service.ComprobanteAbstract;
import pe.crvm.ventaapp.service.FacturaService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        // Dato
        double total = 567.34;
        // Proceso
        /*::::::::: FACTURA :::::::::*/
        ComprobanteAbstract comp = new FacturaService();
        
        ItemDto[] repo = comp.procesar(total);
        // Reporte
        System.out.println(":::::::FACTURA:::::::");
        for(ItemDto dto : repo){
            System.out.println(dto.getConcepto() + " | " + dto.getValor());
        }
        /*::::::::: BOLETA :::::::::*/
        ComprobanteAbstract comp2 = new BoletaService();
        
        ItemDto[] repo2 = comp2.procesar(total);
        // Reporte
        System.out.println("\n:::::::BOLETA:::::::");
        for(ItemDto dto : repo2){
            System.out.println(dto.getConcepto() + " | " + dto.getValor());
        }
        
        
        
    }
}
