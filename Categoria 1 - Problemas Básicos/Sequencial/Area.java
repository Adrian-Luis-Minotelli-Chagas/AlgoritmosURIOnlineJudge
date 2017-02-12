import java.util.Scanner;
import java.util.Locale;

public class Area{
   public static void main(String[] args){
      
      Locale.setDefault(Locale.US);
      
      Scanner ler = new Scanner(System.in);
      
      double a=0,b=0,c=0;
      
      a = ler.nextDouble();
      b = ler.nextDouble();
      c = ler.nextDouble();
          
      System.out.printf("TRIANGULO: %.3f\n",(a*c)/2);
      System.out.printf("CIRCULO: %.3f\n",(c*c)*3.14159);
      System.out.printf("TRAPEZIO: %.3f\n",((a+b)*c)/2);
      System.out.printf("QUADRADO: %.3f\n",b*b);
      System.out.printf("RETANGULO: %.3f\n",a*b);
   }
}