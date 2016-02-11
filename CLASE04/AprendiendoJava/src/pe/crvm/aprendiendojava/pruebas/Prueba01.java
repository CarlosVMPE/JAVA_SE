
package pe.crvm.aprendiendojava.pruebas;

import pe.crvm.aprendiendojava.Interfaces.*;
import pe.crvm.aprendiendojava.service.MateService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        
        MateService v_m = new MateService();
        
        Idemo3 v_n =  v_m;
        IDemo4 v_p = v_m;
        Idemo2 v_q = v_m;
        
        
        
        
    }
}
