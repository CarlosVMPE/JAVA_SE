package pe.egcc.service.prueba;

import java.util.Random;
import pe.egcc.service.impl.regimen1.CompImplRegimen1;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba03 {

  public static void main(String[] args) {
    Object[] lista = new Object[10];
    mostrar(lista);
    lista[1] = "cadena";
    lista[3] = 3333.77;
    lista[4] = new CompImplRegimen1();
    lista[6] = new Random();
    mostrar(lista);
  }

  private static void mostrar(Object[] lista) {
    System.out.println("--------------------");
    for (Object obj : lista) {
      System.out.println(obj);
    }
  }
}
