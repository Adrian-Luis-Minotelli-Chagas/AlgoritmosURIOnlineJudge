import java.util.Scanner;
import java.util.Locale;

public class OMaior{
   public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      
      Scanner ler = new Scanner(System.in);
      
      int a = ler.nextInt();
      
      int b = ler.nextInt();
      
      int c = ler.nextInt();
      
      a = (a+b+Math.abs(a-b))/2;

      a = (a+c+Math.abs(a-c))/2;
          
      System.out.printf("%d eh o maior\n",a);

   }
}