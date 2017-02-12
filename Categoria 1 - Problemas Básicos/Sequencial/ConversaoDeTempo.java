import java.util.Scanner;
import java.util.Locale;

public class ConversaoDeTempo{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int n = ler.nextInt();
   int t = n/3600;
      
   System.out.printf("%d",t);
   n -=t*3600;
   t = n/60;
   System.out.printf(":%d",t);
   n -=t*60;
   System.out.printf(":%d\n",n);


   }
}