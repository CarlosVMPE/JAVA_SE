
package pe.crvm.aprendiendojava.pruebas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class Prueba08 {
    public static void main(String[] args) {
        Map<String,Object> datos = new HashMap<>();
        
        datos.put("001","Carlos Vílchez");
        datos.put("002","Armando Paredes");
        datos.put("003","Laura Torres");
        datos.put("004","Claudia Ramos");
        
        for(String key: datos.keySet()){
            System.out.println(key + " | "+datos.get(key));
        }
        System.out.println("------------------");
        datos.put("002","karla Torres");
        
        for(String key: datos.keySet()){
            System.out.println(key + " | "+datos.get(key));
        }
        
    }
}
