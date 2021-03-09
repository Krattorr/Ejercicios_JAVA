
/* El loro guradara en un fichero txt las resouestas puestas por el usuario y las imprimira */

import java.io.*;

public class Recordat {
	static int track =0;
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
        
    }
    
    
     public static void processaEntrada(final String nomFitxer) throws IOException {
    	BufferedReader Entrada = new BufferedReader (new InputStreamReader (System.in));
    	BufferedWriter input = new BufferedWriter(new FileWriter(nomFitxer));
    	 while(true){
	  String up= System.lineSeparator();
          System.out.println("El lloro pregunta paraula: ");
          String resposta=Entrada.readLine().trim();
          
          if(resposta.isEmpty() || resposta.isBlank()){
          	break;
          }

          else{
          	input.write(resposta+up);
          	System.out.println("El lloro registra: "+resposta);
         	
         	}
         	track++;
        }
         input.close();
    }
    
    public static void mostraRecords(final String nomFitxer) throws IOException {
       BufferedReader input = new BufferedReader(new FileReader(nomFitxer));
      String linea ="";
       if (track ==0 && linea.isEmpty()){
      		System.out.println ("El lloro no recorda res");
      }
       while ((linea= input.readLine()) != null ){
       	System.out.println("El lloro recorda: "+linea);
       	 }
       	  System.out.println("Adéu");
     			input.close();	   		
    }
    
   
}
    

