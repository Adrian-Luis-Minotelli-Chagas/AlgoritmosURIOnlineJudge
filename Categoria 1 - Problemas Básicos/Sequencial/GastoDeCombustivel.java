import java.util.Scanner;
import java.util.Locale;

public class GastoDeCombustivel{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
       
   Scanner ler = new Scanner(System.in);
     
   System.out.printf("%.3f\n", (double)(ler.nextInt()*ler.nextInt())/12 );

   }
}