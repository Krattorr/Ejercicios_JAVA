public class SequenciaCreixent {
    public static void main(String[] args) {
    int pequeño=0;
    int contador=0;
    
    while(true){
        
        System.out.println("Introdueix un valor");
        int num1 = Integer.parseInt(Entrada.readLine());
	if(pequeño==num1){
	break;
	}  
        
        if(pequeño<num1){
        contador++;
        	pequeño=num1;
        	
        }
        if(pequeño>num1){
        	break;
        	
        }
        
       

     }
 	System.out.println("Longitud de la següència creixent:"+contador);
 
 
        
}
}
