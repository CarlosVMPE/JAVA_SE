/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.sistuni.proyectoservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.sistuni.proyectoconexion.Conexion;

/**
 *
 * @author Alvaro
 */
public class ServiceOperaciones {
    
    private Conexion con = new Conexion();
    
public void generar_archivo_ps4(String ruta , String periodo , String nombre) throws SQLException, IOException{
    
    PreparedStatement ps = con.GetConnection().prepareStatement("SELECT * FROM recibo_honorario WHERE primer_nombre_buscar = '"+nombre+"' and ANIODECONSULTA = "+periodo);
    ResultSet rs = ps.executeQuery();
      


File f = new File(ruta);

try{

FileWriter w = new FileWriter(f);

BufferedWriter bw = new BufferedWriter(w);

PrintWriter wr = new PrintWriter(bw);  

while (rs.next()){

wr.write("06|"+rs.getString("RUC")+"|"+rs.getString("RUC:APELLIDO_PATERNO")+"|"+rs.getString("RUC:APELLIDO_MATERNO")+"|"+rs.getString("RUC:1ER_NOMBRE")+"|1|0| \n");//escribimos en el archivo
wr.println();
}
wr.close();

bw.close();


}catch(IOException e){};

    
}
    
public String buscar_proveedor(String nombre) throws SQLException
{
    
    PreparedStatement ps = con.GetConnection().prepareStatement("SELECT * FROM proveedor where 1ER_NOMBRE = '"+nombre+"'");
    ResultSet rs = ps.executeQuery();
         
    nombre = "";
    
      while(rs.next())
     {
        nombre = rs.getString("1ER_NOMBRE");
     }

    return nombre;
}

}
