
package pe.crvm.aprendiendojava.pruebas;


import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Prueba03 {
    public static void main(String[] args) {
        int [] notas = {18,15,6,7,12,14,16};
        
        System.out.println("Cantidad :" +Arrays.stream(notas).count());
        System.out.println("Mayor :" +Arrays.stream(notas).max());
        System.out.println("Menor :" +Arrays.stream(notas).min());
        System.out.println("Promedio :" +Arrays.stream(notas).average());
        
    }
}
