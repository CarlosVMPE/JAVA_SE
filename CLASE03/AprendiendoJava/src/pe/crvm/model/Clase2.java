
package pe.crvm.model;

/**
 *
 * @author Alumno
 */
public class Clase2 extends Clase1{

    protected final String CIUDAD = "CHICLAYO";
    
    public Clase2() {
        super("Esa Geeeente!!!");
    }

    @Override
    public int sumar(int n1, int n2) {
        System.out.println("Ciudad Old: "+super.CIUDAD);
        System.out.println("Ciudad New: "+CIUDAD);
        int value;
        value = (n1 + n2) / (n1 - n2);
        
        return value;
    }
    
    public int potencia(int b, int e){
        int p=1;
        for (int i = 0; i < e; i++) {
            p*=e;
        }
        return p;
    }
    
    
    
}
