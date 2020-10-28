/*
*Lloro que cuando ve un espacio dice adios
*/
public class Lloro {
    public static void main(String[] args) {
    	
    	
        while(true){
        
        System.out.println("El lloro pregunta paraula:");
        String palabra = Entrada.readLine();
		
		if (palabra.isEmpty()){
			   System.out.println("Adéu");
			   break;
		}
		
		if((palabra.isBlank())){
  			System.out.println("Adéu");
			   break;
		}
		
		
		
		else {
		System.out.println("El lloro diu: "+palabra);
		}
		
        
        }

}
}
