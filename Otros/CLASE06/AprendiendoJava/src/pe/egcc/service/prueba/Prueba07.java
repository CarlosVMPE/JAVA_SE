package pe.egcc.service.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.service.model.Producto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba07 {

  public static void main(String[] args) {
    List<Producto> lista = new ArrayList<>();
    
    lista.add(new Producto("Papas", 3.55, 1000));
    lista.add(new Producto("Fideos", 2.89, 1500));
    lista.add(new Producto("Leche", 4.87, 1200));
    lista.add(new Producto("Atun", 7.54, 1800));
    lista.add(new Producto("Arroz", 5.6, 2000));
    lista.add(new Producto("Azucar", 3.98, 5000));
    
    for (Producto p : lista) {
      System.out.println(p.getNombre() + " - " 
              + p.getPrecio() + " - " + p.getStock());
    }
  }
  
}
