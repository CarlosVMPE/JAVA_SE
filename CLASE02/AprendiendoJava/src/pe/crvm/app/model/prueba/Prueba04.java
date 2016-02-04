
package pe.crvm.app.model.prueba;

import pe.crvm.app.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba04 {
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        mostrar(prod1);  // Mostrara los valores por defecto
        System.out.println("----------");
        Producto prod2 = new Producto("Televisor", 100, 3576.34, true);
        mostrar(prod2);
    }
    
    private static void mostrar(Producto prod) {
        System.out.println("Nombre: "+prod.getNombre());
        System.out.println("Precio: "+prod.getPrecio());
        System.out.println("Stock:  "+prod.getStock());
        System.out.println("Activo: "+prod.isActivo());
    }
}
