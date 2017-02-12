import java.util.Scanner;
import java.util.Locale;

public class PositivosEMedia{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   float num = 0;
   float media = 0;
   int cont = 0;
   
   for(int i = 0; i <6; i++){
      num = ler.nextFloat();
      if(num > -1){
         media += num;
         cont++;
      }        
   }
   
   System.out.printf("%d valores positivos\n%.1f\n",cont,media/cont);
     
   }
}