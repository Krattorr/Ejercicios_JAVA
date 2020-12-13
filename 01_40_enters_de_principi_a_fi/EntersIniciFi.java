/*
*El programa contara del valor inicial al valor final pero en con el salto no tinen que contar uno por uno eso ño eligue  el usurario.
*/
public class EntersIniciFi {
    public static void main(String[] args) {
   
     System.out.println("Valor inicial?");
        int numinicial = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor final?");
        int numfinal = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
        
        if(numinicial==numfinal){
        	    System.out.println(numfinal);
        }
        
        while(numinicial<numfinal){
        
        if(numinicial<numfinal){
        
         System.out.println(numinicial);
         numinicial=salt+numinicial;
         
        
        }
        
	  else if(numinicial>numfinal){
	     System.out.println(numinicial);
        	numinicial=salt-numinicial;
	       
	       
	       }
	       
	       
	       
    }
 }
 }
