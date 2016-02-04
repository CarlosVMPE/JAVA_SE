package pe.egcc.service.impl.regimen1;

import pe.egcc.service.espec.CompEspec;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class CompImplRegimen1 implements CompEspec{

  @Override
  public double calcImpuesto(double importe) {
    return (importe * 0.18);
  }

}
