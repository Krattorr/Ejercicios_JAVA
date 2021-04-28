public class Vi{

	 	private String nom;
	 	private int preu;
	 	private int estoc;
	 	
	 	public Vi (String nom,int preu){
	 		setPreu(preu);
	 		setNom(nom);
	 	}
	 	public Vi (String nom,int preu, int estoc){
	 		setPreu(preu);
	 		setNom(nom);
	 		setEstoc(estoc);
	 	}
	 	
	 	public String getNom(){
   	 		return nom;
    			}
	 	public int getPreu(){
   	 		return preu;
    			}
    		public int getEstoc(){
   	 		return estoc;
    			}
    			
	 	public void setPreu(int preu){
	 	if(preu>=0){
	 		preu=preunou;
	 	}
	 	}
	 	public void setEstoc(int estoc){
	 	if(estoc<=-1){
	 		nouestoc=0;
	 		estoc=nouestoc;
	 	}
	 	if(estoc<=-1){
	 		nouestoc=0;
	 		estoc=nouestoc;
	 	}
	 	}
	 	public String normalitzaNom(String nom){
	 	if (nom.equals("Roura blanc")){
	 	return "Roura blanc";
	 	}
	 	else {
	 	return "nom no vàlid";
	 	}
	 	}

	@Override
	public String toString() {
    		return String.format("%n\tVi: %s%n\tPreu: %d%n\tEstoc: %d%n",
                         nom, preu, estoc);
		}
		
		
}

/*
 * Aquesta classe fa una comprovació ràpida del funcionament de la classe
 * Vi
 */
public class UsaVi {
    public static void main(String[] args) {
        System.out.println("Vi sense estoc" + new Vi("Roura blanc", 1234));
        Vi vi = new Vi("Roura blanc", 1234, 24);
        System.out.println("Vi amb estoc" + vi);
        vi.setPreu(vi.getPreu() + 120);  // incrementa preu del vi
        vi.setEstoc(vi.getEstoc() - 10); // decrementa el nombre d'ampolles
        System.out.println("Vi modificat" + vi);
    }
}
