import java.util.Scanner;
import java.util.Locale;

public class Salario{
   public static void main(String[] args){
   
   Locale.setDefault(Locale.US);
   
   Scanner ler = new Scanner(System.in);
       
   System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", ler.nextInt(),ler.nextInt()*ler.nextDouble() );
   }
}