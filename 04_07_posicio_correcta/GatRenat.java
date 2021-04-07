
/* Aqui esta gat rent con los public y private donde esta el codigo del ejercicio */

public class GatRenat {
    private int vides = 7;
    private String posicio="estirat";
    
    public int novesVides=vides;
    public String novaPosicio=posicio;
     
    public int getVides() {  //  retorna el nombre de vides
        return vides;
    }
    public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }
    
    public String getPosicio(){
   	 return posicio;
    }
    
     public String setPosicio(String novaPosicio){
     
   	 if (novaPosicio.equals("dret") || novaPosicio.equals("assegut") || novaPosicio.equals("estirat")){
   	 posicio=novaPosicio;
   	 }
   	 
   	return novaPosicio;
    }
    
    
}

