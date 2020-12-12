/*
Preguntara la edad y segun la edad ira a la prision o no.
*/


public class Preso {
    public static void main(String[] args) {
        System.out.println("Com us dieu?");
        String nom = Entrada.readLine();
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat>=18) {
            System.out.println("Vos ja podeu anar a la presó!");
               System.out.println("Aneu amb compte "+nom);
        }
        if (edat < 18) {
            System.out.println("Aneu amb compte "+nom);
        }
         
    }
}
