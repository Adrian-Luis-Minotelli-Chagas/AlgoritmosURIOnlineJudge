import java.util.Scanner;
import java.util.Locale;

public class Intervalo{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   double n = ler.nextDouble();
   
   if( n >= 0.00 && n <= 25.00){
      System.out.printf("Intervalo [0,25]\n");
   }else if(n > 25.00 && n <= 50.00){
      System.out.printf("Intervalo (25,50]\n");
      
   }else if(n > 50.00 && n <= 75.00){
      System.out.printf("Intervalo (50,75]\n");
      
   }else if(n > 75.00 && n <= 100.00){
      System.out.printf("Intervalo (75,100]\n");
      
   }else System.out.printf("Fora de intervalo\n");
   
   
   
   }
}