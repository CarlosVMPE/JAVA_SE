/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regisproapp;

/**
 *
 * @author OPERADOR
 */
public class Alumno {
    
    String Nombre, Apellido, Edad, numero,cod_matri;

    public Alumno(String Nombre, String Apellido, String Edad, String numero, String cod_matri) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.numero = numero;
        this.cod_matri = cod_matri;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCod_matri() {
        return cod_matri;
    }

    public void setCod_matri(String cod_matri) {
        this.cod_matri = cod_matri;
    }
    
    
    
    
}
