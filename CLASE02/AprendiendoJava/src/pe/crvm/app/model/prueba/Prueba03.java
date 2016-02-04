
package pe.crvm.app.model.prueba;

import pe.crvm.app.model.service.MateService;

/**
 *
 * @author Alumno
 */
public class Prueba03 {
    public static void main(String[] args) {
        MateService service = new MateService();
        System.out.println("Promedio 12 y 13: "+service.promedio(12, 13));
        System.out.println("Promedio 12.0 y 13: "+service.promedio(12.0, 13));
        System.out.println("Promedio 12 y 13.0: "+service.promedio(12, 13.0));
        System.out.println("Promedio 12.0 y 13.0: "+service.promedio(12.0, 13.0));
        
        /*Metodo sobre cargado de la clase String*/
        // valueOf : convierte cualquier cosa a String
    }
}
