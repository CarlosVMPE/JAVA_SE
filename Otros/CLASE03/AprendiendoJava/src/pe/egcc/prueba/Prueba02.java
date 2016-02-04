package pe.egcc.prueba;

import pe.egcc.model.Persona;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   18/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    Persona pers1 = new Persona();
    pers1.imprimir();
    
    Persona pers2 = new Persona("Gustavo Coronel", 51, true);
    // pers2.imprimir();
    System.out.println("---------------------------");
    System.out.println("Nombre: " + pers2.getNombre());
    System.out.println("Edad: " + pers2.getEdad());
    System.out.println("Casado: " + (pers2.isCasado()?"SI":"NO"));
  }
}
