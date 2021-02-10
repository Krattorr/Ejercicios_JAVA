
/* Calculara las possiciones que tenga el string */

public class UtilString{
	public static String intervalString(String palabra, int inici, int acaba){
	String reco = "";
	
	if(inici<0 && acaba<0){
		return reco;
	}
	
	if(inici==0 && acaba==0){
	
	for (int i=inici;i>=acaba;i--){
			reco += palabra.charAt(i);
			}
	
		return reco;
	}
	
	if(inici<acaba){
	
	if(acaba>palabra.length()){
	acaba=palabra.length() -1;
	}
	
	if(inici<0){
		inici=0;
	}
	if(acaba<0){
		acaba=0;
	}
	
	if(inici<0 && acaba<0){
	return reco;
	}
	
	
	for (int i=inici;i<=acaba;i++){
		reco += palabra.charAt(i);
		}
	}
	
		
	if(inici>acaba){
	
		if(inici>palabra.length() ){
		inici=palabra.length() -1;
	}
		if(inici<0){
		inici=0;
	}
		if(acaba<0){
		acaba=0;
	}
	
		for (int i=inici;i>=acaba;i--){
			reco += palabra.charAt(i);
			}
		
		}
		
	
	return reco;
	
	}
}
