
/* Forma un triangulo invertido con las letras que el usario quiera */

public class TriangleLletresInvertit{
    public static void main (String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        dibuixaTriangle(text);
    }
    public static void dibuixaTriangle(String text){
        for(int linia=text.length()-1;linia>=0;linia--){
            System.out.println();
            dibuixaLinia(text,linia);
        }
    }
    public static void dibuixaLinia(String text, int linia){
        for(int columna=linia;columna>=0;columna--){
            char col = text.charAt(columna);
            System.out.print(col);
            if(columna > 0){
                System.out.print(", ");
            }
        }
    }

}
