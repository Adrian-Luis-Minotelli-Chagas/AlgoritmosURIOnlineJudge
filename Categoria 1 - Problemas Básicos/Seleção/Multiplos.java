import java.util.Scanner;
//import java.util.Locale;

public class Multiplos{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   int a = ler.nextInt(); 
   int b = ler.nextInt();
   
   if( a%b == 0 || b%a == 0){
      System.out.printf("Sao Multiplos\n");
   }else System.out.printf("Nao sao Multiplos\n"); 
   
   
   
   

   }
}