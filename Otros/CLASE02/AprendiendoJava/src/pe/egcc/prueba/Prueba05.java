package pe.egcc.prueba;

import pe.egcc.service.MyMath;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   20/01/2016
 */
public class Prueba05 {

  public static void main(String[] args) {
    // Variables
    double importe, impuesto;
    // Dato
    importe = 456.78;
    // Proceso
    impuesto = MyMath.calcularImpuesto(importe);
    // Reporte
    System.out.println("Importe: " + importe);
    System.out.println("Impuesto: " + impuesto);
  }
  
}
