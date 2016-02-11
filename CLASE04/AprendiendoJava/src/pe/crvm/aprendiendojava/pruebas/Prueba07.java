
package pe.crvm.aprendiendojava.pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Prueba07 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Carlos Vílchez");
        lista.add("Armando Paredes");
        lista.add("Elvis Tek");
        
        for(String nombre: lista){
            System.out.println(nombre);
        }
        
    }
}
