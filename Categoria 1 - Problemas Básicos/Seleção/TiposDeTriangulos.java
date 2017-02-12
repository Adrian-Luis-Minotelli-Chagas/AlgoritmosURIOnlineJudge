import java.util.Scanner;
import java.util.Locale;

public class TiposDeTriangulos{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   float a = ler.nextFloat(); 
   float b = ler.nextFloat();
   float c = ler.nextFloat();
   float aux = 0;

   if(a < b){
      aux = a;
      a = b;
      b = aux;
   
   }
   
   if(a < c){
      aux = a;
      a = c;
      c = aux;
   } 
   
   if( a >= b+c ){
      System.out.printf("NAO FORMA TRIANGULO\n"); 
   }else{
      
      a = (float)Math.pow(a,2);
      b = (float)Math.pow(b,2);
      c = (float)Math.pow(c,2);
   
      if(a == b+c) System.out.printf("TRIANGULO RETANGULO\n"); 
   
      if(a > b+c) System.out.printf("TRIANGULO OBTUSANGULO\n"); 
   
      if(a < b+c) System.out.printf("TRIANGULO ACUTANGULO\n"); 
   
      if(a == b && a == c){
         System.out.printf("TRIANGULO EQUILATERO\n"); 
      
      }else if(a == b || a == c || b == c) System.out.printf("TRIANGULO ISOSCELES\n"); 
      
      }
   
   }
}