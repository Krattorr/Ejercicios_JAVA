
/* Comprueba si es vocal en la primera posicion y ultima */

public class LloroVocalIniciFi {
    public static void main(String[] args) {
    while(true){
    
    
    System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
    String resposta=Entrada.readLine();
    
    	
		if (resposta.isEmpty() || resposta.isBlank()){
			System.out.println("El lloro demana confirmació per finalitzar");
			   resposta =Entrada.readLine();
			   if(UtilitatsConfirmacio.respostABoolean(resposta)){
			   	break;
			   }
			   else{
			   	continue;
			   }
			   
		}
		
		
		if(resposta.length()!=0 && UtilString.esVocal(resposta.charAt(0)) || UtilString.esVocal(resposta.charAt(resposta.length()-1))) {
		System.out.println("El lloro diu: "+resposta);
		
		}
   
    
    	}
    	System.out.println("Adéu");
    
    }
    
}

