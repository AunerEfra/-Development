/*Dadas las variables de tipo int M = 6, T = 1, K = -10
indicar si la evaluación de estas expresiones daría como resultado verdadero o falso
 
 */
package verdadero_falso;


public class Verdadero_Falso {

    
    public static void main(String[] args) {
         int M = 6, T = 1, K = -10;
         int R2;
         int R3;
         double R;
          R = T/K ;
          R2= M+T;
          R3= M-T;
     
     if ( M > T){
         System.out.println("6>1 es mayor " + M);
         
     }
     else {
         System.out.println("6>1 es menor " + T);
     }
        
     if ( R == -5){
         System.out.println("1/-10=-5 es verdadero " + R);
         
     }
     else {
         System.out.println("1/-10= -5 falso "   + R);
     }
     if ( M > T){
         
     }
         if (R2==7 || R3==5){
             System.out.println("6+1=7  6-1=5 Es verdadera " );
              
         }
         
         else {
              System.out.println("6+1=7  6-1=5 Es falso " );
         }
    
     
    }
    //realizado por Auner Castillo
}
