import java.util.Scanner;
import java.util.Locale;

public class CoordenadasDeUmPonto{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   float x = ler.nextFloat(); 
   float y = ler.nextFloat();
   
   if( x == 0.0 && y == 0.0 ){
      System.out.printf("Origem\n");
      
   }else if( x == 0.0 ){
      System.out.printf("Eixo Y\n");
     
   }else if( y == 0.0){
      System.out.printf("Eixo X\n");
   
   }else if( x > 0){
      if( y > 0){
         System.out.printf("Q1\n");
      }else System.out.printf("Q4\n");
   
   }else if( y > 0){
      System.out.printf("Q2\n");
   
   }else System.out.printf("Q3\n");
      
      
 
   }
}