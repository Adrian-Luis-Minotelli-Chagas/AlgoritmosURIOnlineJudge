import java.util.Scanner;
import java.util.Locale;

public class MediasPonderadas{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int n = ler.nextInt();
  
   for(int i=0; i < n; i++){   
      System.out.printf("%.1f\n",( ( ler.nextFloat()*2.0 ) +
      ( ler.nextFloat()*3.0 )+
      ( ler.nextFloat()*5.0 ) ) /10.0);
   }
   
  
   }
}