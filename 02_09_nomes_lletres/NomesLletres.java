
/* El usuario pondra una palabra esta sera dividida con comas */

public class NomesLletres{
    public static void main (String[] args){
    
        System.out.println("Text?");
        String texto = Entrada.readLine();
        filtraLletres(texto);
}
    
    public static void filtraLletres(String texto){
        for(int i=0;i<=texto.length()-1;i++){ 
            char colum = texto.charAt(i); 
            
            if(Character.isLetter(colum) && colum == 0){
               System.out.println(colum+",");
               
            }
            
            if(Character.isLetter(colum) && i != texto.length()-2){ 
                System.out.print(colum+", ");
                
            }
            else if(Character.isLetter(colum)){ 
                System.out.print(colum+" ");
            }
        }
        
        System.out.println();
    }
}
