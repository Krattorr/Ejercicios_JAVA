/*
*El programa ira contando segun el salto que abremos puesto asta llegar la numero final deseado.
*/
public class NaturalsIniciFi {
    public static void main(String[] args) {
    
     System.out.println("Valor inicial?");
        int numinicial = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor final?");
        int numfinal = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());
        
        
        
        for(int i=salt;numinicial<=numfinal;i++){
        
        
        	System.out.println(numinicial);
        	numinicial=numinicial+i;
         
        	i--;
        	
        	
    }    
        
}
}
