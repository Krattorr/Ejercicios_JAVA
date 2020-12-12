/*
*Pondremos un valores y el programa nos ira contando los numero parejos 
*/
public class ComptaParells {
    public static void main(String[] args) {
    
    	  int parell=0;
    	
       
       
       while (true){
       
         	System.out.println("Introdueix un valor");
        	int num1 = Integer.parseInt(Entrada.readLine());
       
		if ((num1%2 ==0 || num1==0)&& !(num1<=-1)){
		
		parell++;
   		 
   		 }
   		 
   		 if (num1<=-1){
   			 break;
   			 
   		}
   		
   	}
   	
   	System.out.println("Parells introduïts: "+parell);
   	
  }
  }
