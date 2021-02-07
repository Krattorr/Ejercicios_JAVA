
/* Hace un recorrido de la palabra seleccionada por el usuario y muestra las letras de esa palabra */
public class MostraInterval {
	public static void main (String[] args){
	
	 System.out.println("text?");
     	String palabra = Entrada.readLine();
	
	 System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
	
	 System.out.println("final?");
        int acaba = Integer.parseInt(Entrada.readLine());
	 mostraInterval(palabra, inici, acaba);
	 
}

	public static void mostraInterval(String palabra, int inici, int acaba){
	

	
	if(inici<0 && acaba<0){
		System.out.println("");
		return;
	}
	
	if(inici==0 && acaba==0){
		for (int i=inici;i>=acaba;i--){
			System.out.println(palabra.charAt(i));
			}
	}
	
	
	if(inici<acaba){
	
	if(acaba>palabra.length()){
	acaba=palabra.length() -1;
	}
	
	if(inici<0){
		inici=0;
	}
	if(acaba<0){
		acaba=0;
	}
	
	if(inici<0 && acaba<0){
		System.out.println("");
	}
	
	
	for (int i=inici;i<=acaba;i++){
		System.out.println(palabra.charAt(i));
		
		}
		
	}
	
		
	if(inici>acaba){
	
		if(inici>palabra.length() ){
		inici=palabra.length() -1;
	}
		if(inici<0){
		inici=0;
	}
		if(acaba<0){
		acaba=0;
	}
	
		for (int i=inici;i>=acaba;i--){
			System.out.println(palabra.charAt(i));
			
			}
			
		
		}
		
}
}



		
