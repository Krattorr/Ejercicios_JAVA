public class UtilitatsConfirmacio{

	public static void main(String[] args){
		
		String resposta = Entrada.readLine();
		boolean confirma = respostABoolean(resposta);
		respostABoolean(resposta);
	}


	public static boolean respostABoolean(String resposta) {
		  
			
		if (null == resposta) {     
		    return false;
		}
		resposta = resposta.toLowerCase();
		if (resposta.equals("s") || resposta.equals("y")) {
		    return true;
		}
		if (resposta.equals("sí") || resposta.equals("yes")) {
		    return true;
		}
		if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {
		    return true;
		}
		return false;
    }  
    
}
