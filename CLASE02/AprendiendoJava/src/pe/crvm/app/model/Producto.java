
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

    /**
     * Constructor por Defecto
     */
    
    public Producto() { //Constructor por defecto porque no tiene parametros
        /*Inicializando Variables*/
        this.nombre="Curso Programador Java";
        this.precio=300.0;
        this.stock =20;
        this.activo=true;
        System.out.println("Objeto Creado! por Constructor por Defecto");
    }
    
    /**
     * Constructor con Parametros
     * 
     * @param nombre Nombre del producto
     * @param stock Stock del producto
     * @param precio  Precio del producto
     * @param activo Estado del producto
     *                  Si no esta a la venta es false
     */

    public Producto(String nombre, int stock, double precio, boolean activo) {
        System.out.println("Objeto Creado! por Constructor por Parametros");
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.activo = activo;
        
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
