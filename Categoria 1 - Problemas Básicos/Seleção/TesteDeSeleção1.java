import java.util.Scanner;
//import java.util.Locale;

public class TesteDeSeleção1{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int a = ler.nextInt();
   int b = ler.nextInt();
   int c = ler.nextInt();
   int d = ler.nextInt();
   
   if( b > c && d > a && (c+d) > (a+b) && c >=0 && d >=0 && a%2==0 ){
      System.out.printf("Valores aceitos\n");
   }else System.out.printf("Valores nao aceitos\n");
      
   
   
   }
}