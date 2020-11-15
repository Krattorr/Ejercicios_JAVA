/*
*Recorrido de numeros con comitas con dos piramides
*/


public class Triangle{
    public static void main(String[] args) {
          System.out.println("quants?");
        	int num = Integer.parseInt(Entrada.readLine());
        	
        	int acomular=0;
        	

    while(acomular!=num){
    	
    	
    	
	for (int fila=9;0<=fila;fila--){ 
	
		for(int i=1;i<=fila;i++){
			System.out.print("*");
			
			
		}
		
		for(int j=fila;j<9;j++){
		
		if(j==9){
			continue;
		}
		System.out.print("" +j);
		}
		


	 	 for(int columna=9;columna>=fila;columna--){
			
 			System.out.print("" +columna);

 			}
 			
 		for(int i=fila;i>0;i--){
			System.out.print("*");
			
			
		}

            	 System.out.println("");
            	 

		}
		 acomular+=1;
	}
		
}
}
