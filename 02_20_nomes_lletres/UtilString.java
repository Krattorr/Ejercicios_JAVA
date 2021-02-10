
/* Hara la separacion de las letras y quitara espacios y numeros */

public class UtilString{
	public static String nomesLletres(String text){

	String strin = text.replaceAll("[^A-Za-zÀ-ÿ]","");
	return strin;
	
	}
	public static String lletresSeparades(String text){
	String reco = "";
	
	for (int i=0;i<text.length();i++){
		if(i == text.length() -1){
		reco += text.charAt(i);
		}
		else{
		reco += text.charAt(i) +", ";
		}
	}
	return reco;
	
	

}
}

