
/* Problema dos de array con 5 de espacios con interacion del usuario */
public class EntersEntreComes {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        
        System.out.println("Valor 1?");
        int valor0=Integer.parseInt(Entrada.readLine());
       numeros[0]=valor0;
       
         System.out.println("Valor 2?");
       int valor1=Integer.parseInt(Entrada.readLine());
       numeros[1]=valor1;
       
         System.out.println("Valor 3?");
       int valor2=Integer.parseInt(Entrada.readLine());
        numeros[2]=valor2;
        
         System.out.println("Valor 4?");
       int valor3=Integer.parseInt(Entrada.readLine());
        numeros[3]=valor3;
        
         System.out.println("Valor 5?");
      int valor4=Integer.parseInt(Entrada.readLine());
       numeros[4]=valor4;
       
       
       
         for (int i = 0; i < numeros.length; i++) {
            if(i==numeros.length-1){
            	System.out.print(numeros[i]);
            	
        }
        else {
        	System.out.print(numeros[i]+", " );
        	}
        	}
        System.out.println();
       	   
        }

    }


