
/* MUchos constructores  */

public class GatRenat{
	
	private int vides = 7;
    	private String posicio="estirat";
	
	 public void setPosicio(String posicio){
	   	 if (!posicio.equals("dret")){
	   	 this.posicio="estirat";
	   	 }
	   	 else{
	   	 this.posicio=posicio;
	   	 }
	   	 if(posicio.equals("assegut")){
	   	 this.posicio=posicio;
	   	 }
   	 }
   	 
   	 public String getPosicio(){
   	 		return posicio;
    			}
    			
    	 public GatRenat(int vides,String posicio) {
        		setVides(vides);
       		 setPosicio(posicio);
    	}
    	 public GatRenat(int vides) {
    	 		posicio="estirat";
        		setVides(vides);
    	}
    	 public GatRenat(String posicio) {
        		setPosicio(posicio);
    	}
    	 public GatRenat() {
        		posicio="estirat";
        		vides=7;
    	}
    	
    	public int getVides() { return vides; }
    	
    	public void setVides(int novesVides) {
        if (novesVides > 0)  {
            vides = novesVides;
        }
    }
    	
    	  @Override
    		public String toString() {
    		return String.format("Vides: %d. Posició: %s", vides,posicio);
      	}		
    			
    	
	
	public static void main(String[] args) {
		GatRenat[] renats = {
		    new GatRenat(),         // tot per defecte
		    new GatRenat(8),        // 8 vides i posició per defecte
		    new GatRenat("dret"),   // posició dret i vides per defecte
		    new GatRenat(8, "dret") // 8 vides i posició dret

		};
        for (GatRenat renat: renats) {
            System.out.println(renat);
        }
   	 
    }
    
}
