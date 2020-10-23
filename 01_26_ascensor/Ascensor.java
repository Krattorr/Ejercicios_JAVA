public class Ascensor {
    public static void main(String[] args) {
    	
    	System.out.println("pis?");
        String pis = Entrada.readLine();
        
    	
        if(pis.equals("planta baixa")){
		System.out.println("botó?");
		String boto = Entrada.readLine();
        
        	 if(boto.equals("pujar un")){
        		System.out.println("primer pis");
        		}
        	else if(boto.equals("baixar un")){
        		System.out.println("error");
        		}
        	else if(boto.equals("pujar dos")){
        		System.out.println("segon pis");
        		}
        	 else if(boto.equals("baixar dos")){
        		System.out.println("error");
        		
       	 }
       	 else{
        	System.out.println("error");
        	}
       	
        }
        if(pis.equals("sotan")){
        	System.out.println("botó?");
		String boto = Entrada.readLine();
		
		System.out.println("error");
		
        }
        if(pis.equals("golfes")){
        	System.out.println("botó?");
		String boto = Entrada.readLine();
		
		System.out.println("error");
		
        }
        
        if(pis.equals("segon pis")){
        	System.out.println("botó?");
		String boto = Entrada.readLine();
		
		if(boto.equals("pujar un")){
        		System.out.println("error");
        		}
        	else if(boto.equals("baixar un")){
        		System.out.println("primer pis");
        		}
        		
        	else if(boto.equals("baixar dos")){
        		System.out.println("planta baixa");
        		}
        		
        	else if(boto.equals("pujar dos")){
        		System.out.println("error");
        		}
        		else{
        	System.out.println("error");
        	}
        	
        }
        
        if(pis.equals("primer pis")){
        	System.out.println("botó?");
		String boto = Entrada.readLine();
		
		if(boto.equals("pujar un")){
        		System.out.println("segon pis");
        		}
        	else if(boto.equals("baixar un")){
        		System.out.println("planta baixa");
        		}
        		
        	else if(boto.equals("baixar dos")){
        		System.out.println("error");
        		}
        		
        	else if(boto.equals("pujar dos")){
        		System.out.println("error");
        		}
        	else{
        	System.out.println("error");
        	}
        		
        	
		
		
	}

  }
  }
