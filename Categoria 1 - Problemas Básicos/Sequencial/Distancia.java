import java.util.Scanner;
import java.util.Locale;

public class Distancia{
   public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      
      Scanner ler = new Scanner(System.in);

          
      System.out.printf("%d minutos\n", ler.nextInt()*2 );

   }
}