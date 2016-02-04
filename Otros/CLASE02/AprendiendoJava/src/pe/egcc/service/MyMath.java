package pe.egcc.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   20/01/2016
 */
public class MyMath {

  public static final double IGV;
  
  static {
    IGV = 0.18;
  }
  
  public static double calcularImpuesto(double importe){
    double impuesto;
    impuesto = importe * IGV;
    return impuesto;
  }
  
  
}
