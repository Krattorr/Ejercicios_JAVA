import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NomICognom {
    
    public static void main(String[] args)throws IOException{
    BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        // obté el nom
        System.out.println("Com et dius?");
        String nom =reader.readLine();


        // obté el cognom
        System.out.println("I quin és el teu primer cognom?");
        String cognom =reader.readLine();

        // Mostra resultat
        System.out.println("Ei " + nom + ", tinc una amiga que també és " +  cognom);
    }
}
