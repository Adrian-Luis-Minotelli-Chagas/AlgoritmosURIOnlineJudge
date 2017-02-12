import java.util.Scanner;
//import java.util.Locale;

public class ParOuImpar{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int m = ler.nextInt();
   int n = 0;
  
   for(int i=0; i < m; i++){
      
      n = ler.nextInt();
      
      if( n%2 != 0){
         
         if(n > 0){
            System.out.printf("ODD POSITIVE\n");
         }else System.out.printf("ODD NEGATIVE\n");
         
      }else if(n > 0){
         System.out.printf("EVEN POSITIVE\n");
      
      }else if(n != 0){
         System.out.printf("EVEN NEGATIVE\n");
      
      }else System.out.printf("NULL\n");
   
   }
   
  
   }
}