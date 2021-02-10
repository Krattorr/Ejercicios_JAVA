
/* La terminal nos imprimira un tablero con piezas */

public class Escacs {
    public static void main(String[] args){
    	char[][] taulell;
    	taulell = new char[8][8];
    	
    	for (int fila = 0; fila < 8; fila++) {
    		for (int columna = 0; columna < 8; columna ++) {
        		taulell[fila][columna]='·';
        		
    		}
	}
		taulell[1][0]='p';
    		taulell[5][6]='P';
    		taulell[5][7]='R';
    		taulell[6][5]='A';
    		taulell[7][7]='r';
    		
    	for (int fila = 0; fila < 8; fila++) {
    	for (int columna = 0; columna < 8; columna ++) {
        		System.out.print(taulell[fila][columna]);
        		
    		}
    		System.out.println();
	}
		

	}
}
