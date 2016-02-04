package pe.egcc.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @date 18/01/2016
 */
public class Persona {

  private String nombre;
  private int edad;
  private boolean casado;

  public Persona() {
    this.nombre = "Claudia Ramos";
    this.edad = 25;
    this.casado = false;
  }

  public Persona(String nombre, int edad, boolean casado) {
    this.nombre = nombre;
    this.edad = edad;
    this.casado = casado;
  }

  public void imprimir() {
    String datos;
    datos = getNombre() + " - " + getEdad() + " - " + isCasado();
    System.out.println(datos);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public boolean isCasado() {
    return casado;
  }

  public void setCasado(boolean casado) {
    this.casado = casado;
  }

}
