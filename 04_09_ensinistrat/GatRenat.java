/* Aqui estaran los public y privante con las funciones de visdas y posicioes */

public class GatRenat{


	private int vides=7;
	 	private String posicio="estirat";
	 	
	 	
	 	public int getVides() {  //  retorna el nombre de vides
       		 return vides;
   			 }
   			 
   			 
    		public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
       		 if (novesVides >= 0) {
           		 vides = novesVides;
        		}
   		 }
    
   		public String getPosicio(){
   	 		return posicio;
    			}
    
   		  public String setPosicio(String novaPosicio){
     
   	 		if (novaPosicio.equals("dret") || novaPosicio.equals("assegut") || novaPosicio.equals("estirat")){
   			 posicio=novaPosicio;
   			 }
   	 
   			return novaPosicio;
   			 }
    
    		
    		public boolean estaViu(){
    		return (getVides()>0);
    		}
    		public boolean estaDret(){
    		return (getPosicio().equals("dret"));
    		}
    		public boolean estaAssegut(){
    		return (getPosicio().equals("assegut"));
    		}
    		public boolean estaEstirat(){
    		return (getPosicio().equals("estirat"));
    		}
	


	public int num =0;

	public String aixecat(){
	if(num==1){
		return "no faig res";
	}
		num=1;
		return "m'aixeco";
		
	}
	
	public String seu(){
	if(num==2){
		return "no faig res";
	}
		num=2;
		return "m'assec";
	}
	
	public String estirat(){
	if(num==3){
		return "no faig res";
	}
		num=3;
		return "m'estiro";
	}
}
