
/* La palabra que el usuario ponga en el programa cada letra estara cerrada por un parentesis */

public class Parentitza{
    public static void main (String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        parentitza(text);
    }
    public static void parentitza(String text){
        for(int i=0;i<=text.length()-1;i++){
            char colum = text.charAt(i);
            if(Character.isLetter(colum)){
               System.out.print("("+colum+")");
            }
            else{
                System.out.print(colum);
            }
        }
    }
}
