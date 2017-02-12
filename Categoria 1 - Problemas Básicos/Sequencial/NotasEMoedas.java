import java.util.Scanner;
import java.util.Locale;

public class NotasEMoedas{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   double valor = ler.nextDouble();
      
   System.out.printf("NOTAS:\n");
   System.out.printf("%d nota(s) de R$ 100.00\n",(int)valor/100);
   System.out.printf("%d nota(s) de R$ 50.00\n",(int)valor%100/50);   
   System.out.printf("%d nota(s) de R$ 20.00\n",(int)valor%100%50/20);   
   System.out.printf("%d nota(s) de R$ 10.00\n",(int)valor%100%50%20/10);   
   System.out.printf("%d nota(s) de R$ 5.00\n",(int)valor%100%50%20%10/5);   
   System.out.printf("%d nota(s) de R$ 2.00\n",(int)valor%100%50%20%10%5/2);   
   System.out.printf("MOEDAS:\n");
   System.out.printf("%d moeda(s) de R$ 1.00\n",(int)valor%100%50%20%10%5%2/1);   
   System.out.printf("%.0f moeda(s) de R$ 0.50\n",Math.floor(valor%100%50%20%10%5%2%1/0.50));   
   System.out.printf("%.0f moeda(s) de R$ 0.25\n",Math.floor(valor%100%50%20%10%5%2%1%0.50/0.25));   
   System.out.printf("%.0f moeda(s) de R$ 0.10\n",Math.floor(valor%100%50%20%10%5%2%1%0.50%0.25/0.10));   
   System.out.printf("%.0f moeda(s) de R$ 0.05\n",Math.floor(valor%100%50%20%10%5%2%1%0.50%0.25%0.10/0.05));   
   System.out.printf("%.0f moeda(s) de R$ 0.01\n",Math.floor(valor%100%50%20%10%5%2%1%0.50%0.25%0.10%0.05/0.01));
  
   }
}