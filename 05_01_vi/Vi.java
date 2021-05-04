<<<<<<< HEAD
/* Sumaremos vidas y restaremos vidas a gatrenat */

public class Vi{

	 	private String vi;
	 	
	 	
	 	
   			 }
=======
/*
Primera version sr estrella esta es la versio de vi, falta botiga y entorn
*/

public class Vi{

	 	private String nom;
	 	private int preu;
	 	private int estoc;
	 	
	 	public Vi (String nom,int preu){
	 		setPreu(preu);
	 		this.nom=normalitzaNom(nom);
	 	}
	 	public Vi (String nom,int preu, int estoc){
	 		setPreu(preu);
	 		this.nom=normalitzaNom(nom);
	 		setEstoc(estoc);
	 	}
	 	
	 	
	 	public int getPreu(){
   	 		return preu;
    			}
    		public int getEstoc(){
   	 		return estoc;
    			}
    			
	 	public void setPreu(int preunou){
	 	if(preu>=0){
	 		preu=preunou;
	 	}
	 	}
	 	public void setEstoc(int nouestoc){
	 	if(nouestoc<=-1){
	 		estoc=nouestoc;
	 	}
	 	if(nouestoc>=0){
	 		
	 		estoc=nouestoc;
	 	}
	 	}
	 	public static String normalitzaNom(String nounom){
	 	if(nounom.isBlank() || nounom.isEmpty()){
	 	return "nom no vàlid";
	 	}
	 	return nounom.trim().replaceAll("\\s+"," ");
	 	}

	@Override
	public String toString() {
    		return String.format("%n\tVi: %s%n\tPreu: %d%n\tEstoc: %d%n",
                         nom, preu, estoc);
		}
		
		
}
>>>>>>> 887c41efaec8e4ae429e64085f6f97308a36b595
