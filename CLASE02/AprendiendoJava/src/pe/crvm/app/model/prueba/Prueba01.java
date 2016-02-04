
package pe.crvm.app.model.prueba;

import pe.crvm.app.model.Producto;

/**
 *
 * @author Carlos
 */
public class Prueba01 {
    public static void main(String[] args) {
        /*Instanciar producto*/
        Producto prod1 = new Producto();
        
        mostrar(prod1);
        prod1.setNombre("Laptop");
        prod1.setPrecio(5000.0);
        
        System.out.println("----------");
        mostrar(prod1);
    }
    /************cada tipo primitivo tiene su equivalente en clase************/
    private static void mostrar(Producto prod) {
        System.out.println("Nombre: "+prod.getNombre());
        System.out.println("Precio: "+prod.getPrecio());
        System.out.println("Stock:  "+prod.getStock());
        System.out.println("Activo: "+prod.isActivo());
    }
}
