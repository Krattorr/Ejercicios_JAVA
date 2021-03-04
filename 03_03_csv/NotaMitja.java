
/* Tenemos un fichero con nombres y notas y ignora la primera fila y hace la media de la notas de los alumnos */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NotaMitja {
     public static void main(String[] args )throws IOException {
     	String cami = "notes.csv";
     	BufferedReader input = new BufferedReader(new FileReader(cami));
     	String linea =input.readLine();
     	
     		while ((linea= input.readLine()) != null ){
     			double sum=0;
     			 String[] elements = linea.split(",");
     			 String nombres=elements[0];
     			 
     			 for(int i = 0; i < elements.length; i++){
     			 	if(UtilString.esEnter(elements[i])){
     			 		sum+=Double.parseDouble(elements[i]);
     			 		
     			 	
     			 	}
     			 	
     			 }
     			 
     			 System.out.printf("%s (%.2f)%n",nombres,sum/6);
     		}
     	}
     }
     			
