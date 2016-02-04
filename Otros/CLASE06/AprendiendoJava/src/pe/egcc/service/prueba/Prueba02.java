package pe.egcc.service.prueba;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   27/01/2016
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    int[] datos;
    datos = new int[5];
    mostrarArreglo(datos);
    datos[2] = 50;
    mostrarArreglo(datos);
    // Recorrido tipo colección
    System.out.println("------------------------");
    for(int dato: datos){
      System.out.println(dato);
    }
  }

  private static void mostrarArreglo(int[] datos) {
    System.out.println("-----------------------");
    for (int i = 0; i < datos.length; i++) {
      int dato = datos[i];
      System.out.println(dato);
    }
  }
  
}
