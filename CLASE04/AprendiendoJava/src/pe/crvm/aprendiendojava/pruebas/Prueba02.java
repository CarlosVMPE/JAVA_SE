
package pe.crvm.aprendiendojava.pruebas;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Prueba02 {
    public static void main(String[] args) {
        int notas[]; // Arreglo de tipo Primitivo, su valor por defecto es 0
        notas = new int [5];
        
        for(int i = 0; i< notas.length; i++){
            int nota = notas[i];
            System.out.println(nota);
        }
        System.out.println("-----------Recorrido tipo Conleccion-----------");
        notas[3] = 600;
        // Recorrido tipo coleccion
        for(int nota: notas){
            System.out.println(nota);
        }
        System.out.println("-----------Recorrido Usando Lambda-----------");
        notas[1] = notas[3]/3;
        Arrays.stream(notas).forEach(n -> System.out.println(n));
        
    }
}
