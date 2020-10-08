public class Preso {
    public static void main(String[] args) {
        System.out.println("Com es diu?");
        String nom = Entrada.readLine();
        System.out.println("Quina edat té?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat>=18) {
            System.out.println("Ala trena perro");
        }
        if (edat < 18) {
            System.out.println("A un centro de menores crack");
        }
    }
}
