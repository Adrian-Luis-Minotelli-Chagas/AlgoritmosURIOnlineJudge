import java.util.Scanner;
import java.util.Locale;

public class AumentoDeSalario{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   double sal = ler.nextDouble(); 
   double percentual = 0;
   
   if(sal <= 400.00){
      percentual = sal*0.15;
      
   }else if( sal <= 800.00){
      percentual = sal*0.12;
   
   }else if(sal <= 1200.00){
      percentual = sal*0.10;
   
   }else if(sal <= 2000.00){
      percentual = sal*0.07;
   
   }else percentual = sal*0.04;
   
   
   System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %%\n",percentual+sal, percentual,(percentual*100)/sal );
   
    

   
   
   }
}