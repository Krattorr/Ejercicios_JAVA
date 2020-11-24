/*
*El se le dice la edad que tuvo dura los años que a vivido
*/
public class HistoricEdats {
    public static void main(String[] args) {
    int contador =0;
    
     System.out.println("nom?");
     	String nom = Entrada.readLine();
    
    System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());
        
    System.out.println("any actual?");
        int añoactual= Integer.parseInt(Entrada.readLine());

        int añonacimiento = añoactual-edat;
        
        if(edat <0 || nom.isEmpty() || añoactual <=1970){
        	System.out.println("Entrada errònia");
        }
        
         else{
        for(int i=añonacimiento;i < añoactual;i++){
        	
        	if (añonacimiento ==i ){
        		System.out.println("El "+i+" va néixer");
        	}
        	
        	
        	
        	
        	else if (edat>0){
        		contador+=1;
        		
        		if(contador==1){
        		        	
        		System.out.println("El "+i+" tenia "+contador+" any");
        		}
        		
        		else if(contador>=2){
        			     System.out.println("El "+i+" tenia "+contador+" anys");
        			     
        		}
        	    }
        
        
        
     		
     
     
     
     
        }
        
        System.out.println("Adéu "+nom);
        }
}
}
