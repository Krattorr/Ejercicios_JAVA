/*
*Tabla de multiplicar con args nosotros elegiremos que operadores pondremos
*/


public class TaulaMultiplicar{
    public static void main(String[] args) {
    
    if (args.length == 4){
    	int num = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int num3 = Integer.parseInt(args[2]);
	int num4 = Integer.parseInt(args[3]);
    
    for (int i =num; i<=num2;i++){
    	for(int j =num3;j<=num4;j++){
    	
    		System.out.println(i+" x "+j+" = "+(i*j));
    		
    		}
    	}
    	
    	}
    	
    	else{
    		return;
    	}
    }
}
