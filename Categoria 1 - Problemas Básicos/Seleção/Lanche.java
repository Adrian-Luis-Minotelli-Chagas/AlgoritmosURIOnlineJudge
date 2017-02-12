import java.util.Scanner;
import java.util.Locale;

public class Lanche{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   double[] preco = {4.00,4.50,5.00,2.00,1.50};
   
   int c = ler.nextInt();
   
   System.out.printf("Total: R$ %.2f\n",ler.nextInt()*preco[c-1]);
   
   
   
   }
}