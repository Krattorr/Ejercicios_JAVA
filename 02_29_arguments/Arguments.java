
/* El programa comprobara las posiciones del array y los separaraa en numeros o letras  */

public class Arguments{
	public static void main(String[] args){
	       int caracteres=Integer.parseInt(Entrada.readLine());

	 	int pos = 0;

   		 if(args.length == 0){
        		System.out.println("Cap argument");
   		 }
    else{
        for(int i = 0; i < args.length; i++){
            if(UtilString.esEnter(args[i])){
                System.out.println("[" + pos +"] " + "\""+args[i]+"\"" + ": " + "és enter");
            }
            else{
                System.out.println("[" + pos +"] " + "\""+args[i]+"\"" + ": " + "no és enter");
            }
            pos++;    
        }
    }    
    }            
}



