import java.util.Scanner;
//import java.util.Locale;

public class SeisNumerosImpares{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int num = ler.nextInt();
   
   if(num%2 == 0){
      num++;
      for(int i = 0; i < 6; i++){
         System.out.printf("%d\n",num);
         num +=2;
      }
   
   }else for(int i = 0 ; i < 6; i++){
            System.out.printf("%d\n",num);
            num +=2;
         }
   
   
     
   }
}