
package pe.crvm.mateapp.service;

/**
 *
 * @author Alumno
 */
public final class MyMath {

    private MyMath() { // para que no se puedan crear objetos
    }
    
    public static long factorial(int n){
        long f = 1;
        while(n > 1){
            f *= n ;
            n--;
        }
        return f;
    }
    
    public static int mcd(int n1, int n2){
        return 0;
    }
        
    public static int mcm(int n1, int n2){
        return 0;
    }
    
    /*
    * Este metodo retorna
    * @param n El numero de terminos de la serie.
    * @return retorna un String con los "n" terminos de la serie.
    */
    public static String fibonacci(int n1){
        return "";
    }
    
    public static boolean primo(int n1) {
        return false;
    }
    
}
