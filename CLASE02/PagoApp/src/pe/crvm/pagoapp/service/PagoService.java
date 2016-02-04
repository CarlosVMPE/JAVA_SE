
package pe.crvm.pagoapp.service;

import pe.crvm.pagoapp.dto.PagoDto;

/**
 *
 * @author Alumno
 */
public class PagoService {
    public void procesar(PagoDto dto){
        // Variables
        double ingresos, renta, neto;
        
        ingresos = dto.getDias() * dto.getPagoHora()*dto.getHorasDia();

        if(ingresos > 1500){
            renta = ingresos * 0.08;
        }else{
            renta = 0.0;
        }
        
        neto =  ingresos - renta;
        // Reporte 
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
               
    }
}
