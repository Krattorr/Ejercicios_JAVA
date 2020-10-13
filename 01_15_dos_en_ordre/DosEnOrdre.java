public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());

        System.out.println("Segundo?");
        int segon = Integer.parseInt(Entrada.readLine());
        
        if(primer>segon){
        System.out.println("primer numero" +segon+"segundo numero"+primer);
        }
        
        if(primer<segon){
        System.out.println("primer numero"+primer+"segundo numero"+segon);
        }
        if(primer==segon){
        System.out.println("Son iguales"+primer+"y"+segon);
        }
    }
}
