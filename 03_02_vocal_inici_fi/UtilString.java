/* Comprueba las posociones si tienen vocal */

public class UtilString{
	 public static boolean esVocal(char resposta){
	 	if(resposta == 'a' || resposta == 'e' || resposta == 'i' || resposta == 'o' || resposta == 'u' || resposta == 'à' || resposta == 'è' || resposta == 'é' ||
                   resposta == 'í' || resposta == 'ò' || resposta == 'ó' || resposta == 'ú' || resposta == 'ü' || resposta == 'A' || resposta == 'À' || resposta == 'E' ||
           		resposta == 'È' || resposta == 'É' || resposta == 'I' || resposta == 'Í' || resposta == 'Ì' || resposta == 'Ï' || resposta == 'O' || resposta == 'Ó' ||
         	  	resposta == 'Ò' || resposta == 'U' || resposta == 'Ú' || resposta == 'Ü' || resposta == 'ï'){

                        return true;
                }
                else{
                        return false;
                }
        }
}
	
