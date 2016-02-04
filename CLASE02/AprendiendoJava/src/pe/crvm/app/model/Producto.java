
package pe.crvm.app.model;

/**
 *
 * @author Carlos
 */
public class Producto {
    private String nombre;
    private int stock;
    private double precio;
    private boolean activo;

    
    public Producto() { //Constructor por defecto porque no tiene parametros
        /*Inicializando Variables*/
        this.nombre="Curso Programador Java";
        this.precio=300.0;
        this.stock =20;
        this.activo=true;
        System.out.println("Objeto Creado!");
    }
    
    /**********Destructor**********/
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.err.println("Chau Objeto!");
    }
    
    
    
   
    /* Encapsulando las variables */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
    
}
