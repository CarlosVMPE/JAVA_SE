package pe.egcc.service.prueba;

import pe.egcc.service.espec.CompEspec;
import pe.egcc.service.impl.regimen1.CompImplRegimen1;
import pe.egcc.service.impl.regimen2.CompImplRegimen2;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba01 {

  public static void main(String[] args) {
    CompEspec comp = new CompImplRegimen2();
    System.out.println("Impuesto: " + comp.calcImpuesto(4567.89));
  }
  
}
