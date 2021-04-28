	

public class EntersEntreComes {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        
        System.out.println("Primer?");
        int numeros = Integer.parseInt(Entrada.readLine());
        
        
        System.out.print(numeros[0]);
           for (int i = 1; i < numeros[5]; i++) {
            System.out.print(", " + numeros[i]);
        }
        System.out.println();
    }
}

