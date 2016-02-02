
package pe.crvm.pedidoapp.prueba;

import pe.crvm.pedidoapp.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    public static void main(String[] args) {
        // Dato
        double importe = 7890.0;
        // Proceso
        PedidoService service = new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total    = service.calcularTotal(importe);
        // Reporte
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
        
    }
    
}
