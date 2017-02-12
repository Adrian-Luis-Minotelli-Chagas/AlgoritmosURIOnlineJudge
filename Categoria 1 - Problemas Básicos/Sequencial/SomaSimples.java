import java.util.Scanner;

public class SomaSimples{
   public static void main(String[] args){
   
   int a=0;
   
   Scanner ler = new Scanner(System.in);
   
   a = ler.nextInt();
   
   a += ler.nextInt();
         
   System.out.printf("SOMA = %d\n",a);
   
   }
}