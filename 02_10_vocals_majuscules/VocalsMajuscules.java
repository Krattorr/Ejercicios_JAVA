
/* El usuario introducce una palabra y las vocales se cambiaran a mayusculas */

public class VocalsMajuscules{
    public static void main (String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        majusculitzaVocals(text);
    }
    
    public static void majusculitzaVocals(String text){
        if(text.length() == 0){
            System.out.println("error");
        }
        else{
            for(int i=0;i<=text.length()-1;i++){
            
                char palabra = text.charAt(i);
                
                if(palabra =='a'||palabra=='e'||palabra =='i'||palabra =='o'||palabra =='u'){
                    System.out.print(Character.toUpperCase(palabra));
                    }
                    
                else if(Character.isUpperCase(palabra) &&
              		 palabra !='A'&& palabra !='E' && palabra!='I'&& palabra !='O'&& palabra !='U'){
                   		 System.out.print(Character.toLowerCase(palabra));
                    
                }
                
                else if(palabra != 'a'||palabra != 'e'||palabra != 'i'||palabra != 'o'||palabra != 'u'||
               		 palabra=='A'||palabra =='E'||palabra =='I'||palabra =='O'||palabra =='U'){
               			 System.out.print(palabra);
                }
            }
        }        
    }
}
