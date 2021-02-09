/*
Dibuja un quadrado con nuestro codigo el dibujo estara formado por Y.
 */

   public class Quadrat {
    public static void main(String[] args) {
        int costat = Integer.parseInt(args[0]);
        char caracter = args[1].charAt(0);
        dibuixaQuadrat(costat, caracter);
    }
    public static void dibuixaQuadrat(int costat, char caracter){
    	
    	for (int linea=1;linea<=costat;linea++){
    	
    	dibuixaLinea(costat, caracter);
    	}
    
    }
    
    public static void dibuixaLinea(int costat, char caracter){
    for (int columna=1;columna<=costat;columna++){
    	System.out.print(" "+caracter);
    	
    }
    
   
     System.out.println();
}
}
