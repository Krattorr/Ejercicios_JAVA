/*
Programa de un semaforo normal y corriente pero nosotros elegimos el color
*/

public class Semafor {
    public static void main(String[] args) {
    System.out.println("Ets major d'edat?");
    if(UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())){
    
    	System.out.println("Color?");
        String color = Entrada.readLine();
    	
    		if(color.equals("verd")){
		System.out.println("passa");
		
		}
		
		if(color.equals("groc")){
			System.out.println("corre!");
		
		}
	
		if(color.equals("vermell")){
			System.out.println("espera");
		
		}
		
		
		if(color.equals("magenta")){
			System.out.println("ves a l'oculista");
		}
	}
	
	
		else{
	
		 System.out.println("No pots fer servir aquest programa sense supervisió");
		}
	}
}
	

