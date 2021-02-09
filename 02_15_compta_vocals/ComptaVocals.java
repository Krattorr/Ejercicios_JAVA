/*
 * programa que mostra quantes 'a's i 'e's té un text
 */
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        int numAs = quantesOcurrencies(entrada, 'a');
        int numÁs = quantesOcurrencies(entrada, 'à');
        int numEs = quantesOcurrencies(entrada, 'e');
        int numÈs = quantesOcurrencies(entrada, 'è');
        int numÉs = quantesOcurrencies(entrada, 'é');
        int numIs = quantesOcurrencies(entrada, 'i');
        int numÍs = quantesOcurrencies(entrada, 'í');
        int numÏs = quantesOcurrencies(entrada, 'ï');
        int numOs = quantesOcurrencies(entrada, 'o');
        int numÓs = quantesOcurrencies(entrada, 'ó');
        int numÒs = quantesOcurrencies(entrada, 'ò');
        int numUs = quantesOcurrencies(entrada, 'u');
        int numÚs = quantesOcurrencies(entrada, 'ú');
        int numÜs = quantesOcurrencies(entrada, 'ü');
        mostraOcurrencies('a', numAs);
        mostraOcurrencies('à', numÁs);
        mostraOcurrencies('e', numEs);
        mostraOcurrencies('è', numÈs);
        mostraOcurrencies('é', numÉs);
        mostraOcurrencies('i', numIs);
        mostraOcurrencies('í', numÍs);
        mostraOcurrencies('ï', numÏs);
        mostraOcurrencies('o', numOs);
        mostraOcurrencies('ó', numÓs);
        mostraOcurrencies('ò', numÒs);
        mostraOcurrencies('u', numUs);
        mostraOcurrencies('ú', numÚs);
        mostraOcurrencies('ü', numÜs);
     }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
