/*
*Recorrido de numeros con comitas
*/


public class TriangleInvertit {
    public static void main(String[] args) {
    
    System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());
    	
    	 if (valor==1){
    		System.out.println(valor);
    	 return;
    	 }
    	
    	for(int linea=valor; linea>=1;linea--){
    		for(int columna=1;columna<=linea;columna++){
	    	 
	    	 	        System.out.print("" +columna);
	    	 	        
	    	 if(linea>columna){
	    		System.out.print(","+" ");
	    	 	    
	    	 	    
	    	  }
	    	 	        
	    	 	}
	    	
	    	 	    	 System.out.println("");
	    	 	  }
}
}
