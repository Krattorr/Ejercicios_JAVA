
/*Mostra interval de una frase o palabra que el usuario quiera */

public class MostraInterval {
	public static void main (String[] args){
	
	 System.out.println("text?");
     	String palabra = Entrada.readLine();
	
	
	 System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
	
	 System.out.println("final?");
        int acaba = Integer.parseInt(Entrada.readLine());
	
	String palabras = UtilString.intervalString(palabra, inici, acaba);
	
	
	 System.out.println(palabras);
	
}
}
