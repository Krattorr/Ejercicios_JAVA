/*
Pondra en orden los numeros que ponga el usuario
*/


public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());

        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        if(primer>segon){
        System.out.println("" +segon+" i "+primer);
        }
        
        if(primer<segon){
        System.out.println(""+primer+" i "+segon);
        }
        if(primer==segon){
        System.out.println(""+primer+" i "+segon);
        }
    }
}
