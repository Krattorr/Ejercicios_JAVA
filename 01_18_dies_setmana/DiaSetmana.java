
public class DiaSetmana {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        if (numero==1){
        	System.out.println("Dilluns");
        }
         if (numero==2){
        	System.out.println("Dimarts");
        }
         if (numero==3){
        	System.out.println("Dimecres");
        }
         if (numero==4){
        	System.out.println("Dijous");
        }
         if (numero==5){
        	System.out.println("Divendres");
        }
         if (numero==6){
        	System.out.println("Dissabte");
        }
         if (numero==7){
        	System.out.println("Diumenge");
        }
         if (numero<=0){
        	System.out.println("Error");
        }
        if (numero>=8){
        	System.out.println("Error");
        }
       }
}
