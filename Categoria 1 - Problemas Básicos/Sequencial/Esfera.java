import java.util.Scanner;
import java.util.Locale;

public class Esfera{
   public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      
      Scanner ler = new Scanner(System.in);
    
      System.out.printf("VOLUME = %.3f\n", (4.0/3)*3.14159*Math.pow(ler.nextInt(),3) );
   }
}