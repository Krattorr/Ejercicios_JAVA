/*
 Es un programa suma las notas asta que pongas una nota incorrecta que seria un numero inferior a 0 
*/


public class SumaNotes {
    public static void main(String[] args) {
    
    int valor=0;
    
      System.out.println("Introdueix una nota");
        int num1 = Integer.parseInt(Entrada.readLine());
    
    while (num1<100 && num1>=0){
    
    	valor=num1 + valor;
    
  	  System.out.println("Introdueix una nota");
   	 num1 = Integer.parseInt(Entrada.readLine());
   	 
   	 
        
    }
          System.out.println("La suma de les notes vàlides és "+valor);
    }
    }
