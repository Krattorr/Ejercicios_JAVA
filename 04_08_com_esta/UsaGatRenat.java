/* Aqui estaran los prints del ejercicios */

public class UsaGatRenat{
	 public static void main(String[] args) {
	 	GatRenat renat = new GatRenat();
	 	
	 	System.out.println("Inicialment renat.estaViu(): "+renat.estaViu());
		System.out.println("Inicialment renat.estaDret(): "+renat.estaDret());
		System.out.println("Inicialment renat.estaAssegut(): "+renat.estaAssegut());
		System.out.println("Inicialment renat.estaEstirat(): "+renat.estaEstirat());
		
		System.out.println("Introdueix quantes vides:");
		int novesVides = Integer.parseInt(Entrada.readLine());
		renat.setVides(novesVides);
		
		System.out.println("Introdueix nova posició:");
		String nuevaPosicio = Entrada.readLine();
		
		renat.setPosicio(nuevaPosicio);
		System.out.println("Finalment  renat.estaViu(): "+renat.estaViu());
		System.out.println("Finalment  renat.estaDret(): "+renat.estaDret());
		System.out.println("Finalment  renat.estaAssegut(): "+renat.estaAssegut());
		System.out.println("Finalment  renat.estaEstirat(): "+renat.estaEstirat());
		
	}
}
