/*
*El program pedira una palabra y mirara si la penultima letra es igual que la segunda.
*/
public class SegonaIgualPenultima{
    public static void main(String[] args) {
    
    
    
    while (true){
    
	    System.out.println("El lloro pregunta paraula que finalitzicper vocal en minúscules");
	          String palabra = Entrada.readLine();
	     
	     
	     
	     if(palabra.isEmpty() || palabra.isBlank()){

		                        break;
		                }
		                
	     int posFinal = palabra.length()-2;
		char caracterFinal = palabra.charAt(posFinal);
		
		if(caracterFinal==palabra.charAt(1));
		System.out.println("Segona igual a penúltima");
	}		
}
}
