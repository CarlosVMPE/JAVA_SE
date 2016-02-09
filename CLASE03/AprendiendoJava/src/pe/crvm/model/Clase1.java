
package pe.crvm.model;

/**
 *
 * @author Alumno
 */
public class Clase1 { // si se aplica "final" a una clase ya no se puede heredar
    
    protected final String CIUDAD = "LIMA"; // como se aplica "final" a una variable, la convierte en constante

    public Clase1() {
        System.out.println("Hola Javeros !");
    }
    
    public Clase1(String nombre){
        System.out.println("Hola amigo(a) "+nombre);
        System.out.println("Nos Vemos en Java Cliente-Servidor");
    }
    
    
    
    public int sumar(int n1, int n2){  // Si se aplica "final" a un metodo ya no se puede sobreescribir
        int value;
        value  = n1 + n2;
        
        return value;
    }
    
    public int restar(int n1, int n2){
        return (n1-n2);
    }
}
