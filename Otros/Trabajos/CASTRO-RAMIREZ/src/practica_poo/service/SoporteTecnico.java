package practica_poo.service;

import practica_poo.service.PersonalSistemas;
import practica_poo.controller.Constructor;
import java.text.DecimalFormat;

public class SoporteTecnico extends PersonalSistemas implements Constructor {

    //String codigo;

    int años;
    static int cont = 0;

    public SoporteTecnico(String nom, String ape, String sex, String dni, String esp, String cat, int a) {
        super(nom, ape, sex, dni, esp, cat);
        this.años = a;
        cont++;
    }

    String GenerarCodigo() {
        DecimalFormat df = new DecimalFormat("ST000 ");
        return df.format(cont);
    }

    public double SBase() {
        if (getEspecialidad().equals("REDES") && getCategoria().equals("NIVEL 1")) {
            return 2800;
        }
        if (getEspecialidad().equals("REDES") && getCategoria().equals("NIVEL 2")) {
            return 2000;
        }
        if (getEspecialidad().equals("SOPORTE PC") && getCategoria().equals("NIVEL 1")) {
            return 2600;
        }
        if (getEspecialidad().equals("SOPORTE PC") && getCategoria().equals("NIVEL 2")) {
            return 1900;
        }
        return 0;

    }

    public double Bonificacion() {
        return 400 + SBase();
    }

    public double Descuento() {
        return (essalud + afp) * SBase();
    }

    double Prestaciones() {
        if (años < 3) {
            return 0.35 * SBase();
        } else {
            return .045 * SBase();
        }
    }

    double SNeto2() {
        return SBase() + Bonificacion() - Descuento() + Prestaciones();
    }

    String DatosVisibles() {
        return super.DatosVisibles() + "CODIGO                : " + GenerarCodigo() + "\n"
                + "AÑOS                : " + años + "\n";

    }

    String DatosCalculables() {
        return super.DatosCalculables() + "SUELDO neto con prestaciones : " + SNeto2() + "\n";
    }

    public String Datos() {
        return " *******    SOPORTE TECNICO     *******\n\n" + DatosVisibles()
                + "\n*******    RESUMEN DE PAGOS   *******\n\n" + DatosCalculables();
    }
}
