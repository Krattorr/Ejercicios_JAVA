/* Problema dos de array con espacios no establecidos con interacion del usuario */
public class EntersEntreComes {
    public static void main(String[] args) {
    
      System.out.println("Quants?");
      int deseado=Integer.parseInt(Entrada.readLine());
       if(deseado<0){
        	 System.out.println("Res a fer");
        	return;
        }
        int[] numeros;
        numeros = new int[deseado];
        
      
        for(int i=0;i<deseado;i++){
        	System.out.println("Valor "+(i+1)+"?");
     		 numeros[i]=Integer.parseInt(Entrada.readLine());
      
       }
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

