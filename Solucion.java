public class Solution {

  
   public static boolean problema(String s){
        
        int i=1;
        int l=s.length();
        boolean sePuede=false;

        while(!sePuede && i<l){
            // crea una subcadena de tamaño i
            String aux=s.substring(0,i);
            // calcula cuantas veces cabe la sub cadena en la cadena original
            int tamMax=l/i;
          
            int i2=1;
            
            //concatena la subcadena
            String creada=aux;

            while(!sePuede && i2<=tamMax){
                if(s.equals(creada)){
                    sePuede=true;
                }else{
                    i2++;
                    creada+=aux;
                }
            }
            
            i++;
            
        }
     
        return sePuede;
    }
  
    public static boolean gus(String str){
      String s=str+str;
      return s.substring(1,s.length()-1).contains(str);
    }
  
  public static void main(String[] args) {
    String prueba1="abab";
    System.out.println(
    System.out.println("Cadena:"+prueba1+"\n "+gus(prueba1));
    
    String prueba2="ababa";
    System.out.println("Cadena:"+prueba2+"\n "+gus(prueba2));
    
    String prueba3="gustavogustavogustavo";
    System.out.println("Cadena:"+prueba3+"\n "+gus(prueba3));
  }
}
