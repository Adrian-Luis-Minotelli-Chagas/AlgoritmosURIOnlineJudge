import java.util.Scanner;
import java.util.Locale;

public class NumerosPositivos{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   int cont = 0;
   for(int n = 1; n < 7; n++){
      if(ler.nextFloat() >= 0.0) cont++;   
   }
   System.out.printf("%d valores positivos\n",cont);
      
   
   }
}