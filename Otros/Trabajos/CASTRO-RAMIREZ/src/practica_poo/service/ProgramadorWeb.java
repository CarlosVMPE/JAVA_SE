/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo.service;

import practica_poo.controller.Constructor;
import java.text.DecimalFormat;

public class ProgramadorWeb extends PersonalSistemas implements Constructor {

    //String codigo;

    static int cont = 0;

    public ProgramadorWeb(String nom, String ape, String sex, String dni, String cat, String esp) {
        super(nom, ape, sex, dni, cat, esp);
        cont++;
    }

    String GenerarCodigo() {
        DecimalFormat df = new DecimalFormat("PW000 ");
        return df.format(cont);
    }

    public double SBase() {
        if (getCategoria().equals("SENIOR") && getEspecialidad().equals("JAVA DEVELOPER")) {
            return 2900;
        }
        if (getCategoria().equals("SENIOR") && getEspecialidad().equals("NET DEVELOPER")) {
            return 2800;
        }
        if (getCategoria().equals("MASTER") && getEspecialidad().equals("JAVA DEVELOPER")) {
            return 3700;
        }
        if (getCategoria().equals("MASTER") && getEspecialidad().equals("NET DEVELOPER")) {
            return 3200;
        }
        return 0;
    }

    public double Bonificacion() {
        if (getEspecialidad().equals("JAVA DEVELOPER")) {
            return SBase() * 0.19;
        }
        if (getEspecialidad().equals("NET DEVELOPER")) {
            return SBase() * 0.21;
        }
        return 0;
    }

    public double Descuento() {
        return (afp + essalud) * SBase();
    }

    String DatosVisibles() {
        return super.DatosVisibles() + "CODIGO                : " + GenerarCodigo();

    }

    String DatosCalculables() {
        return super.DatosCalculables();
    }

    public String Datos() {
        return " *******    PROGRAMADOR WEB     *******\n\n" + DatosVisibles()
                + "\n*******    RESUMEN DE PAGOS   *******\n\n" + DatosCalculables();
    }
}
