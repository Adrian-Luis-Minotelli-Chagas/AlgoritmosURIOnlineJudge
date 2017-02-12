import java.util.Scanner;
import java.util.Locale;

public class Cedulas{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int notas = 0;
   int n = ler.nextInt();
      
   System.out.printf("%d\n",n);
   notas = n/100;
   System.out.printf("%d nota(s) de R$ 100,00\n",notas);
   n -=notas*100;
   notas = n/50;
   System.out.printf("%d nota(s) de R$ 50,00\n", notas);
   n -=notas*50;
   notas = n/20;
   System.out.printf("%d nota(s) de R$ 20,00\n", notas);
   n -=notas*20;
   notas = n/10;
   System.out.printf("%d nota(s) de R$ 10,00\n", notas);
   n -=notas*10;
   notas = n/5;
   System.out.printf("%d nota(s) de R$ 5,00\n", notas);
   n -=notas*5;
   notas = n/2;
   System.out.printf("%d nota(s) de R$ 2,00\n", notas);
   n -=notas*2;
   notas = n/1;
   System.out.printf("%d nota(s) de R$ 1,00\n", notas);
   

   }
}