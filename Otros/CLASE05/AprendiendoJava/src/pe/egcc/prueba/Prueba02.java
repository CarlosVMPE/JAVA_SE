package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   25/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {
    Object object = new Clase2();
    System.out.println((object instanceof Object)?"SI Object":"NO Object");
    System.out.println((object instanceof Clase1)?"SI Clase1":"NO Clase1");
    System.out.println((object instanceof Clase2)?"SI Clase2":"NO Clase2");
    System.out.println((object instanceof Clase3)?"SI Clase3":"NO Clase3");
    System.out.println((object instanceof Clase4)?"SI Clase4":"NO Clase4");
  }
}
