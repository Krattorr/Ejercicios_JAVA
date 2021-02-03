/*
Dibuja un quadrado con nuestro codigo
 */

public class Quadrat {
    public static void main(String[] args) {
        int costat = Integer.parseInt(args[0]);
        dibuixaQuadrat(costat);
    }
    public static void dibuixaQuadrat(int costat){
    	
    	for (int linea=1;linea<costat;linea++){
    	System.out.println();
    	dibuxaLinea(costat);
    	}
    
    }
    
    public static void dibuxaLinea(int costat){
    for (int columna=1;columna<costat;columna++){
    	System.out.print("x");
    	
    }
    
   
    
}
}
