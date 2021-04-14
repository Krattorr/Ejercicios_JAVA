/* Posició protegida en néixer */

public class GatRenat {
    private int vides = 7;
    private String posicio="dret";
    
    public GatRenat(int vides,String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public String getPosicio() {return posicio;}
    
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    
    
     public void setPosicio(String novaPosicio){
     
   	 if (!novaPosicio.equals("dret")){
   	 posicio="estirat";
   	
   	 }
   	 else{
   	 posicio=novaPosicio;
   	 }
   	 
   	
    }
    @Override
    public String toString() {
    return String.format("Vides: %d. Posició: %s", vides,posicio);
      }
    public static void main(String[] args) {
    	GatRenat renat;
        System.out.println(new GatRenat(7, "dret"));
    }
    }

