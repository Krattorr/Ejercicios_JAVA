/*
*El usuario tiene que adivinar el numero secreto que es el 42
*/
public class SumaInterval {
    public static void main(String[] args) {
   
   int contador=0;
   
   System.out.println("inici?");
        int numinicial = Integer.parseInt(Entrada.readLine());
    
    System.out.println("final?");
        int numfinal = Integer.parseInt(Entrada.readLine());
   
   for(int i=numinicial;i<=numfinal;i++){
  	
  	contador=i+contador;
  	
  	
  	}
  	
  	   for(int i=numinicial;i>=numfinal;i--){
  	
  	contador=i+contador;
  	
  	
  	}
  	
  	if(numinicial==numfinal){
  		  	contador=numfinal; 
  	}
  	int suma=contador;
  	System.out.println(contador);
 	 	
}
}
