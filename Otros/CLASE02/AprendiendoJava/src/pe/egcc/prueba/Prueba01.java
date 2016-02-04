package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   18/01/2016
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    MateService mateService;
    mateService = new MateService();
    System.out.println("7 + 8 = " + mateService.sumar(7, 8));
    System.out.println("7.0 + 8 = " + mateService.sumar(7.0, 8));
    System.out.println("7 + 8.0 = " + mateService.sumar(7, 8.0));
    System.out.println("7.0 + 8.0 = " + mateService.sumar(7.0, 8.0));
    System.out.println("15/2 + 8 = " + mateService.sumar(15/2, 8));
  }

}
