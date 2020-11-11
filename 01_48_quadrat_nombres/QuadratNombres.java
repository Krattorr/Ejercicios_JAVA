/*
*Recorrido de numeros
*/


public class QuadratNombres {
    public static void main(String[] args) {
    
    System.out.println("Valor final?");
        int valor = Integer.parseInt(Entrada.readLine());
    
    
    
    
    if(valor<=0){
    	    System.out.println("Valor inadequat");
    	    
    }
    
    else if(valor>=10){
    	    System.out.println("Valor inadequat");
    	    
    }
    else if(valor>=1 && valor<=9){
	    for(int linea=1;linea<=valor;linea++){
	    	 for(int columna=1;columna<=valor;columna++){
	    	 
	    	 	        System.out.print(" " +columna);
	    	 
	    	 }
	    	 System.out.println();
	    }
    }
    
    
    
 }
 }
    
    

