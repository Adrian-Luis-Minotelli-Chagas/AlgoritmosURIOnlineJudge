import java.util.Scanner;
import java.util.Locale;

public class Triangulo{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   float a = ler.nextFloat(); 
   float b = ler.nextFloat();
   float c = ler.nextFloat();
   
   if( a+b > c && b+c > a && a+c > b){
      System.out.printf("Perimetro = %.1f\n",a+b+c);
   }else System.out.printf("Area = %.1f\n",((a+b)*c)/2.0);
   
   

   }
}