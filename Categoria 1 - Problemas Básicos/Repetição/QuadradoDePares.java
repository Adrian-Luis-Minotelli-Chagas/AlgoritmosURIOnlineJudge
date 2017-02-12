import java.util.Scanner;
//import java.util.Locale;

public class QuadradoDePares{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int n = ler.nextInt();

   
   for(int i=2; i <= n; i+=2)System.out.printf("%d^2 = %d\n",i,i*i);

   
  
   }
}