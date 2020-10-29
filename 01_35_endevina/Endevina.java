/*
*El usuario tiene que adivinar el numero secreto que es el 42
*/
public class Endevina {
    public static void main(String[] args) {
    
    int numadivinar=42;
    
     while(true){
     
      System.out.println("Nombre?");
        int num1 = Integer.parseInt(Entrada.readLine());
     
     if(numadivinar>num1){
     System.out.println("Massa petit");
     
     }
      if(num1>=57){
     System.out.println("Fora de rang");
     }
      if(num1<57 && num1>42){
     System.out.println("Massa gran");
     
     }
     
     if(numadivinar==num1){
     System.out.println("Encertat!");
     break;
     }
    
     
     
     
     
     }
    
    
}
}
