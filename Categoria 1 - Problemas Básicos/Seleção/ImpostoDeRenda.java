import java.util.Scanner;
import java.util.Locale;

public class ImpostoDeRenda{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   double sal = ler.nextDouble(); 
   
   if( sal <= 2000.00){
      System.out.printf("Isento\n");
      
   }else if(sal <= 3000.00){
      System.out.printf("R$ %.2f\n",(sal-2000.00)*0.08);
   
   }else if(sal <= 4500.00){
      sal -=3000.00;
      System.out.printf("R$ %.2f\n",80+sal*0.18);
   
   }else{
      sal -=4500.00;
    System.out.printf("R$ %.2f\n",80+270+sal*0.28);
   
   }
   
   }
}