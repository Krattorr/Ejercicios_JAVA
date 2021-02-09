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
