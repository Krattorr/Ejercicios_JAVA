/*
*El program pedira una palabra y para que tengamos el resultado que queremos pondremos, la palabra que pondremos tendra que terminar con una letra si ponemos otra cosa el loro no lo repetira.
*/
public class LloroAcabaLletra {
    public static void main(String[] args) {
    
    
    
    while (true){
    
    System.out.println("El lloro pregunta paraula que finalitzi per lletra");
     String palabra = Entrada.readLine();
     
     
     
     if(palabra.isEmpty() || palabra.isBlank()){

                                break;
                        }
         
    	int posFinal = palabra.length()-1;
	char caracterFinal = palabra.charAt(posFinal);
         
         if(Character.isLetter(caracterFinal))
         	System.out.println("El lloro diu: "+palabra);
                        
	}
	System.out.println("Adéu");                        
}
}

