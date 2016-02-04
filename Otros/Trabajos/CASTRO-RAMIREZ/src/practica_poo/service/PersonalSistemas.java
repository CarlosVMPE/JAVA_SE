
package practica_poo.service;

public abstract class PersonalSistemas {
    private String nombres;
    private String apellidos;
    private String sexo;
    private String DNI;
    private String especialidad;
    private String categoria;
    PersonalSistemas(String nom,String ape,String sex,String dni,String esp,String cat){
      this.nombres=nom;
      this.apellidos=ape;
      this.sexo=sex;
      this.DNI=dni;
      this.especialidad=esp;
      this.categoria=cat;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
     public abstract double SBase();
    public  abstract double Bonificacion();
     public abstract double Descuento();
   
     double SNeto(){
         return SBase() + Bonificacion()-Descuento(); }
       String DatosVisibles(){
        return 
                "NOMBRES                   : "+getNombres()+"\n"+
                "APELLIDOS                 : "+getApellidos()+"\n"+
                "SEXO                      : "+getSexo()+"\n"+
                "DNI                       : "+getDNI()+"\n"+                    
                "ESPECIALIDAD              : "+getEspecialidad()+"\n"+
                "CATEGORIA                 : "+getCategoria()+"\n\n";
              
    }
    String DatosCalculables(){
        return "SUELDO BASE                : "+SBase()+"\n"+
               "BONIFICACION               :"+Bonificacion()+"\n"+
               "DESCUENTO                  : "+Descuento()+"\n"+
               "SUELDO NETO                : "+SNeto()+"\n";
               
    }   
    
}
