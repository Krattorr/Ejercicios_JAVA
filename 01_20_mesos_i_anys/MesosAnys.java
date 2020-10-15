 
public class MesosAnys {
    public static void main(String[] args) {
 
 	System.out.println("Mes?");
        int mes = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
        
        if(mes>1 && mes<11){
        
        	mes=mes-1;
        	int mesos=mes+2;
        	System.out.println("Anterior "+mes+"/"+any+" i posterior "+mesos+"/"+any);
        	
        }
        else if(mes==1){
        
        	mes=12;
        	int mesos=2;
        	int anteriorany=any-1;
        	
        	
        	System.out.println("Anterior "+mes+"/"+anteriorany+" i posterior "+mesos+"/"+any);
        	
        
        }
         else if(mes==12){
        
        	mes=11;
        	int mesos=1;
        	int anteriorany=any;
        	any=any +1;
        	
        	System.out.println("Anterior "+mes+"/"+anteriorany+" i posterior "+mesos+"/"+any);
        	
        
        }
        
     }
}
