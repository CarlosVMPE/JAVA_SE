package pe.egcc.mateexpert.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   20/01/2016
 */
public final class MyMath {

  private MyMath() {
  }
  
  public static long factorial(int n){
    long fact = 1; // Punto de partida
    // Proceso
    for(int i = 2; i <= n; i++){
      fact *= i;
    }
    // Retorno
    return fact;
  }
  
  public static int mcd(int n1, int n2){
    return 0;
  }
  
  public static int mcm(int n1, int n2){
    return 0;
  }
  
  public static String fibonacci(int n){
    return "";
  }
  
  public static boolean  esPrimo(int n){
    return false;
  }

}
