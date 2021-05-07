



public class Botiga{
	 private int DEFAULT_MAX_VINS=100;
	private Vi[] vins;
																																																																																																																																																																																																																																																																																																
	
	public Botiga(int maxVins){
	this.vins=new Vi[maxVins];
	
	}
	
	public Botiga(){
	this.vins=new Vi[DEFAULT_MAX_VINS];
	}
	
	public Vi afegeix(Vi vino){
			    					                                     				         						System.out.print("LENGTH"+vins.length);																																																																																																											
			for(int i=0;i<vins.length-1;i++){
				if(vins[i]!=null){
					
					if(vins[i].getNom().equals(vino.getNom())){
					       System.out.println("Devolvemos nulo");
						return null;
					}
				
				}
				
			}
			
			for(int i=0;i<vins.length-1;i++){

				if (vins[i] == null) {
					System.out.println(i+"ES NULO");
				}	 	
			}
		
		System.out.println("Null al final afefeix");
		return null;	
		
	}
	
	public Vi elimina(Vi vino){
		for(int i=0;i<vins.length-1;i++){
			if(vins[i].equals(vino)){
				if(vins[i].getEstoc()==0){
					vins[i]=null;
						return vino;
					}
			}
			
		}
		return null;
		}
	
	public Vi cerca(String nomVi){
		
		for(int i=0;i<vins.length-1;i++){
			if(vins[i]!=null){
				if(vins[i].getNom()==nomVi){
					return vins[i];
				}
			
		
			}
		}
		return null;
	}
	
	
}
