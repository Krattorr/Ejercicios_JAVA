public class Vi{

	 	private String nom;
	 	private int preu;
	 	private int estoc;
	 	
	 	public Vi (String nom,int preu){
	 		setPreu(preu);
	 		normalitzaNom(nom);
	 	}
	 	public Vi (String nom,int preu, int estoc){
	 		setPreu(preu);
	 		normalitzaNom(nom);
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
	 	if(estoc<=-1){
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
