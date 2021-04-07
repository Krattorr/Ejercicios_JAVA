/* Aqui mostrara los resultados de las variables de GatRenat aqui solo estaran los prints*/

public class UsaGatRenat{
	 public static void main(String[] args) {
	 	GatRenat renat = new GatRenat();
	 
		System.out.println("Vides inicials: " +renat.getVides() );
		System.out.println("Posició inicial: "+renat.getPosicio());
		
		
		System.out.println("Introdueix nova posició:");
		String nuevaPosicio = Entrada.readLine();
		
		renat.setPosicio(nuevaPosicio);
		System.out.println("Posició final: "+renat.getPosicio());
		
		
		
	}
}
