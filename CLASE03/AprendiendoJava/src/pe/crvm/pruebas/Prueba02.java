
package pe.crvm.pruebas;

import pe.crvm.model.*;


/**
 *
 * @author Alumno
 */
public class Prueba02 {
    public static void main(String[] args) {
        Clase2 obj = new Clase2();
        System.out.println("Compatibilidad de un Objeto de Clase2");
        System.out.println("Object: "+ ((obj instanceof Object)?"Si":"NO"));
        System.out.println("Clase1: "+ ((obj instanceof Clase1)?"Si":"NO"));
        System.out.println("Clase2: "+ ((obj instanceof Clase2)?"Si":"NO"));
        System.out.println("Clase3: "+ ((obj instanceof Clase3)?"Si":"NO"));
        System.out.println("Clase4: "+ ((obj instanceof Clase4)?"Si":"NO"));
    }
}
