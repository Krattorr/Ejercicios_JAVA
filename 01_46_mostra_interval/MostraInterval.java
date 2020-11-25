/*
*El usuario tiene que adivinar el numero secreto que es el 42
*/
public class MostraInterval {
    public static void main(String[] args) {
    
     System.out.println("inici?");
        int numinicial = Integer.parseInt(Entrada.readLine());
    
    System.out.println("final?");
        int numfinal = Integer.parseInt(Entrada.readLine());
        
        if (numinicial>numfinal){
        
        	for (int i=numinicial;i>=numfinal;i--){
        		     System.out.println(i);

        	
        	}       
        }
        
        
        if (numinicial<numfinal){
        
        	for (int i=numinicial;i<=numfinal;i++){
        		     System.out.println(i);

        	
        	}       
        }
        
        
      	 if (numinicial==numfinal){
      	 	     System.out.println(numfinal);
      	 
      	 
      	 }
        
        
}
}
