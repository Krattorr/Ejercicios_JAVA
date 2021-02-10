
/* comprobara si es string o int y devolvera un booleano */

public class UtilString{
    public static boolean esEnter(String str){
        
            try {
                    Integer.parseInt(str);
                    return true;
         } 
       	catch (NumberFormatException e) {
                    return false;
                }
     }        
}
