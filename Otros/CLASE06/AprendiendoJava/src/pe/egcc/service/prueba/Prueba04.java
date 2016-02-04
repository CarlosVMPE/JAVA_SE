package pe.egcc.service.prueba;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba04 {

  public static void main(String[] args) {
    int[] numeros = {34,76,12,43,78,23};
    for (int i = 0; i < numeros.length; i++) {
      int numero = numeros[i];
      System.out.println(numero);
    }
    //-------------------
    numeros = new int[]{65,32,45,89,76};
    System.out.println("-----------------");
    for (int numero : numeros) {
      System.out.println(numero);
    }
  }
}
