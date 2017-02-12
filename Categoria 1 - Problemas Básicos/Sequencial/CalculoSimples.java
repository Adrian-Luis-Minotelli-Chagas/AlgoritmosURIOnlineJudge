import java.util.Scanner;
import java.util.Locale;

public class CalculoSimples{
   public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      
      Scanner ler = new Scanner(System.in);
      
      int c1=0,p1=0,c2=0,p2=0;
      double pp1=0,pp2=0;
      
      c1 = ler.nextInt(); p1 = ler.nextInt(); pp1 = ler.nextDouble();
      
      c2 = ler.nextInt(); p2 = ler.nextInt(); pp2 = ler.nextDouble();
      
      System.out.printf("VALOR A PAGAR: R$ %.2f\n", ( p1*pp1 ) + ( p2*pp2 ) );
   }
}