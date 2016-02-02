
package pe.crvm.pedidoapp.service;

/**
 *
 * @author Alumno
 */
public class PedidoService {
    private static double IGV = 0.18; // IGV 18%
    
    public double calcularImpuesto(double importe){
        double impuesto;
        impuesto = importe * IGV;
        return impuesto;
    }
    
    public double calcularTotal(double importe){
        double total;
        total = importe + calcularImpuesto(importe); // total = importe + impuesto
        return total;
    }
}
