package pe.egcc.sistuni.promedioapp.controller;

import pe.egcc.sistuni.lib.Promedio;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   18/01/2016
 */
public class PromedioController {
  
  private Promedio promedio;

  public PromedioController() {
    promedio = new Promedio();
  }
  
  public int promedio(int n1, int n2) {
    return promedio.promediar(n1, n2);
  }

}
