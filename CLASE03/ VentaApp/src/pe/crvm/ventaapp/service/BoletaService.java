/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.crvm.ventaapp.service;

import pe.crvm.ventaapp.dto.ItemDto;

/**
 *
 * @author Alumno
 */
public class BoletaService extends ComprobanteAbstract{

    @Override
    public ItemDto[] procesar(double total) {
            // Variables
        double servicio, totalGeneral;
        // Proceso
        
        servicio = total * SERVICIO;
        totalGeneral = total + servicio;
        // Reporte
                    /** Para la Factura **/
        ItemDto[] repo = {
            new ItemDto("Total", total),
            new ItemDto("Servicio", servicio),
            new ItemDto("Total General", totalGeneral),
        
        };
        
        return repo;
    
    }
    
    
}
