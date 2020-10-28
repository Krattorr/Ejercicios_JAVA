/*
*Calcularemos la nota media
*/


public class NotaMitja {
    public static void main(String[] args) {
    int acumulador=0;
    int repeticion=0;
    int mitjana=0;
    
    while(true){
        
        System.out.println("Introdueix una nota");
        int num1 = Integer.parseInt(Entrada.readLine());
    
    	
    	if(num1<=-1){
        	System.out.println("Cap nota vàlida introduïda");
        		break;
        	}
        	
       if(num1>100){
     	  mitjana=acumulador/repeticion;
      		 break;
       }
       
       acumulador= num1+acumulador;
    	repeticion++;
    	
    }
    
            System.out.println("La mitja de les notes vàlides és"+mitjana);

       
}
}
