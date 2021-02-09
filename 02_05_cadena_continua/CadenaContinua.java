
/* Concatena la palabra elegida si el usuario pone como limite un nombre muy elevado si pone un limite muy pequeño pues no saldra la palabra entera  */
public class CadenaContinua{
    public static void main (String[] args){
        System.out.println("Text?");
        String palabra = Entrada.readLine();
        int longitud = palabra.length();
        mostraCadenaContinua(palabra,longitud);
    }
    
    public static void mostraCadenaContinua(String palabra, int longitud){
        if(palabra.isBlank()){
            System.out.println("error");
        }else{
            System.out.println("Nombre?");
            int numero = Integer.parseInt(Entrada.readLine());
            longitud = palabra.length();
            if(numero >=1){
                for(int cont=0;cont<numero;cont++){
                    System.out.print(palabra.charAt(cont % longitud));
                }
            }
        }
    }
}
