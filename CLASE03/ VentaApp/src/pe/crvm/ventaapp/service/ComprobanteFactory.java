
package pe.crvm.ventaapp.service;

/**
 *
 * @author Alumno
 */
public final class ComprobanteFactory {

    private ComprobanteFactory() {
    }
    
    public static final String COMP_FACTURA = "FACTURA";
    public static final String COMP_BOLETA  = "BOLETA";
    
    public static ComprobanteAbstract obtenerComp(String tipo){
        ComprobanteAbstract comp = null;
        switch(tipo){
            case COMP_FACTURA: comp = new FacturaService(); break;
            case COMP_BOLETA : comp = new BoletaService();  break;
        }
        return comp;
    }
    
}
