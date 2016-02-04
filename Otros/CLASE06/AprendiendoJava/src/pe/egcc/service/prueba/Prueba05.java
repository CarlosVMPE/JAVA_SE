package pe.egcc.service.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.service.impl.regimen1.CompImplRegimen1;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    // Lista generica
    List lista = new ArrayList();
    lista.add(234);
    lista.add(4567.34);
    lista.add(new CompImplRegimen1());
    lista.add("Esto es una cadena");
    
    // Recoriido indexado
    for(int i = 0; i < lista.size(); i++){
      System.out.println(lista.get(i));
    }
    
    lista.add(2, "Gustavo Coronel");
    // Recorrido tipo colección
    System.out.println("--------------");
    for (Object dato : lista) {
      System.out.println(dato);
    }
    
    lista.remove(3);
    // Recorrido tipo stream
    System.out.println("---------------");
    lista.stream().forEach(o -> System.out.println(o) );
  }
  
}
