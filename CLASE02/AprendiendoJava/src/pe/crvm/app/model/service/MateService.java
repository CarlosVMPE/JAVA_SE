
package pe.crvm.app.model.service;

/**
 *
 * @author Alumno
 */
public class MateService {
    public int promedio(int n1, int n2){
        System.out.println("Caso 1");
        int pr;
        pr =(n1+n2)/2;
        return pr;
    }
    
    public double promedio(double n1, int n2){
        System.out.println("Caso 2");
        double pr;
        pr =(n1+n2)/2;
        return pr;
    }
    
    public double promedio(int n1, double n2){
        System.out.println("Caso 3");
        double pr;
        pr =(n1+n2)/2;
        return pr;
    }
    
    public double promedio(double n1, double n2){
        System.out.println("Caso 4");
        double pr;
        pr =(n1+n2)/2;
        return pr;
    }
}
