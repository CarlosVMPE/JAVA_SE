package pe.egcc.mateexpert.controller;

import pe.egcc.mateexpert.service.MyMath;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 22/01/2016
 */
public class MateController {

  public long calcFactorial(int num) {
    return MyMath.factorial(num);
  }

}
