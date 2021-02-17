
/* Iremos a un fichero donde estan las letras y lo comprobaremos si tienen las vocales al proncipio o final */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
	public class FitxerVocalIniciFi{
		public static void main(String[] args) throws IOException {
		String cami = "frases.txt";
		BufferedReader input = new BufferedReader(new FileReader(cami));
		 while (true) {
			 String linea = input.readLine();
			 	if (null == linea) break;
			    		if(linea.length()!=0 && UtilString.esVocal(linea.charAt(0)) || UtilString.esVocal(linea.charAt(linea.length()-1))) {
						System.out.println(linea);
		
		}
   
       	 }
		
		input.close();
		
	}
}
