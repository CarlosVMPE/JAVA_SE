package pe.egcc.service.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba06 {

  public static void main(String[] args) {
    
    List<String> lista = new ArrayList<>();
    
    lista.add("Chiclayo");
    lista.add("Trujillo");
    lista.add("Cuzco");
    lista.add("Arequipa");
    lista.add("Huancayo");
    lista.add("Iquitos");
    
    for (String dato : lista) {
      System.out.println(dato);
    }
    
  }
}
