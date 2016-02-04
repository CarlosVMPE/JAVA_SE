class Demo{

  public static void main(String[] datos){
  
	if( datos == null || datos.length==0 ){
	  System.out.println("Hola Todos.");	
	} else {
	  for(int n = 0; n < datos.length; n++){
	    System.out.println("Hola " + datos[n]);
      }	  
	}
	
  
  }

}