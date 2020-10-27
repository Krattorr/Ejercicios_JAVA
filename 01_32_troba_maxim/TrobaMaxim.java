/*
*El usuario pondra numeros y el programa pondra el maxiomo cuando ponga un numero menor a -1
*/

public class TrobaMaxim {
    public static void main(String[] args) {
    	
    	int maxim=0;
    	
        while(true){
        
        
        System.out.println("Introdueix un valor");
        int num1 = Integer.parseInt(Entrada.readLine());
        
        	if(num1<=-1){
        
        		break;
        	}
        	
        	if (num1<maxim){
        	maxim=maxim;
        	
        	}

		if(maxim<num1){
		
		maxim=num1;
		}
		
	
}

        System.out.println("El màxim és "+maxim);




}
}
