/*
*El program pedira vocales en minuscula si no las recibepreguntara otra vez.
*/
public class LloroVocalMinuscules {
    public static void main(String[] args) {
    
    
    
    while (true){
    
    System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
     String palabra = Entrada.readLine();
     
     
     
     if(palabra.isEmpty() || palabra.isBlank()){

                                break;
                        }
     
     if(palabra.charAt(0) == 'a' || palabra.charAt(0) == 'e' ||palabra.charAt(0) == 'i' ||palabra.charAt(0) == 'o' ||palabra.charAt(0) == 'u' ){
     		System.out.println("El lloro diu: "+palabra);
     }
    
  	 
   
   
    
    
    }
    System.out.println("Adéu");
}
}
