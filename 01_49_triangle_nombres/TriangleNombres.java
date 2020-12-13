/*
*Nuestro programa dibujara triangulo de numeros gracias  a los parametros del for
*/


public class TriangleNombres {
    public static void main(String[] args) {
    
    System.out.println("Nombre?");
        int valor = Integer.parseInt(Entrada.readLine());
        
        
           for (int linea =1;linea<=valor;linea++){
         
           	for(int columna=linea;columna>=1;columna--){
           	
           		System.out.print(" " +columna);
           	}
           		 System.out.println();
        }

    }

}
	    
	    
	    

