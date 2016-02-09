
package pe.crvm.mateapp.controller;

import pe.crvm.mateapp.service.MyMath;

/**
 *
 * @author Carlos
 */
public class AppController {

    public long factorial(int n) {
        return MyMath.factorial(n);
    }
    
     public String fibonacci(int n1){
         return MyMath.fibonacci(n1);
     }
    
}
