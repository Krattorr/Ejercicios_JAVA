/*
*El usuario tiene que adivinar el numero secreto que es el 42
*/
public class Endevina {
    public static void main(String[] args) {
    
    int numadivinar=42;
    
     while(true){
     
      System.out.println("Nombre?");
        int num1 = Integer.parseInt(Entrada.readLine());
     
     if(num1>=1 && num1<100){
     
     	if(num1==numadivinar){
     		System.out.println("Encertat!");
     		break;
     	}
     	else if (num1<42){
     		System.out.println("Massa petit");
     		
     	}
     	
     	else if (num1>42){
     	System.out.println("Massa gran");
    
     
    	 }
    
     
     
    }
    if(num1<=0 || num1>=101){
     	System.out.println("Fora de rang");
    
     }
    
}
}
}
