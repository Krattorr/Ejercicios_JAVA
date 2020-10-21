
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TresEnOrdre {
     public static void main(String[] args) throws IOException {
		  BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));{
		
        System.out.println("Primer?");
        int primero = Integer.parseInt(reader.readLine());

        System.out.println("Segundo?");
        int segon = Integer.parseInt(reader.readLine());
        
        System.out.println("Tercero?");
        int tercero = Integer.parseInt(reader.readLine());
        
        
        if(primero<segon && segon<tercero){
			System.out.println(primero+", "+segon+" i "+tercero);
		}
        
		else if(segon<primero &&  primero<tercero){
			System.out.println(segon+", "+tercero+" i "+primero);
		}
		else if(primero<tercero && tercero<segon){
			System.out.println(primero+", "+tercero+" i "+segon);
		}
        
		
		
		else if(segon<primero &&  primero<tercero){
			System.out.println(segon+", "+primero+" i "+tercero);
		}
		
		
		else if(tercero<segon && segon<primero){
			System.out.println(tercero+", "+primero+" i "+segon);
		}
        
		
		else if(tercero<segon && primero<segon){
			System.out.println(primero+", "+segon+" i "+tercero);
		}
       
       
    }
    }
}
