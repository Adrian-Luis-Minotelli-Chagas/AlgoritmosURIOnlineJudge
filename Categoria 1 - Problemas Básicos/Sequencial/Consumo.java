import java.util.Scanner;
import java.util.Locale;

public class Consumo{
   public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      
      Scanner ler = new Scanner(System.in);
          
      System.out.printf("%.3f km/l\n", ler.nextInt()/ler.nextDouble() );

   }
}