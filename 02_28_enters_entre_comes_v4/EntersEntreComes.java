  
/* Problema dos de array con espacios no establecidos con interacion del usuario */
public class EntersEntreComes {
    public static void main(String[] args) {
    
      System.out.println("Quants?");
      int deseado=Integer.parseInt(Entrada.readLine());
      
          System.out.println("Separador?");
      	String separador=Entrada.readLine();
      	
      	char separadorbueno;
      	
      	if(deseado<0){
        	 System.out.println("Res a fer");
        	return;
        }
      
      if (separador.isEmpty() || separador.isBlank()){
      	separadorbueno=',';
      }
      
      
    	else{
    	 separadorbueno=separador.charAt(0);
      }
      
        int[] numeros;
        numeros = new int[deseado];
        
        
        
        System.out.print(entreComes(numeros,separadorbueno));
        }
        
        public static String entreComes(int[] numeros, char separadorbueno){
        
        String resultado="";
        
		for(int i=0;i<numeros.length;i++){
			System.out.println("Valor "+(i+1)+"?");
	     		 numeros[i]=Integer.parseInt(Entrada.readLine());
	      
	       }
		for (int i = 0; i < numeros.length; i++) {
		     if(i==numeros.length-1){
		    	resultado += numeros[i];
		    	
		}
        
		else{
		resultado += numeros[i]+""+separadorbueno;
       		
      	  }
       
      
        }
         return resultado;
     }
}   	   


