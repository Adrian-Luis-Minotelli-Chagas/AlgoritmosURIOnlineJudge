import java.util.Scanner;
import java.util.Locale;

public class FormulaDeBhaskara{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   double a = ler.nextDouble();
   double b = ler.nextDouble();
   double c = ler.nextDouble();
   double delta =0;
   
   if(a != 0){
      
      delta = Math.pow(b,2)-4*a*c;
      if(delta >= 0){
      
         System.out.printf("R1 = %.5f\n",((-b)+Math.sqrt(delta))/(2*a));
         System.out.printf("R2 = %.5f\n",((-b)-Math.sqrt(delta))/(2*a));
         
      }else System.out.printf("Impossivel calcular\n");
      
   }else System.out.printf("Impossivel calcular\n");
   
   }
}