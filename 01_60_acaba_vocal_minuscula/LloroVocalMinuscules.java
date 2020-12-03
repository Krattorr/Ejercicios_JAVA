/*
*El program pedira vocales en minuscula y que esten en el final de la palabra si no las recibepreguntara otra vez.
*/
public class LloroVocalMinuscules {
    public static void main(String[] args) {
    
    
    
    while (true){
    
    System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
     String palabra = Entrada.readLine();
     
     
     
     if(palabra.isEmpty() || palabra.isBlank()){

                                break;
                        }
     
     if(palabra.endsWith("a") || palabra.endsWith("e") ||palabra.endsWith("i") ||palabra.endsWith("o")  ||palabra.endsWith("u")  ){
     		System.out.println("El lloro diu: "+palabra);
     }
    
  	 
   
   
    
    
    }
    System.out.println("Adéu");
}
}
