



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
		System.out.println(vino+"afegeix");
			for(int i=0;i<vins.length-1;i++){
				if(vins[i]!=null){
					if(vins[i].getNom().equals(vino.getNom())){
						return null;
					}
				
				}
				
			}
			for(int i=0;i<vins.length-1;i++){
				if(vins[i]==null){
					vins[i]=vino;
					System.out.println("metio");
					return vino;
					
				}
			
		
		}
		
	
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
				System.out.println(nomVi+"villa"+vins[i].getNom());
				if(vins[i].getNom()==nomVi){
					System.out.println("dale gaucho");
					return vins[i];
				}
			
		
			}
		}
		return null;
	}
	
	
}
