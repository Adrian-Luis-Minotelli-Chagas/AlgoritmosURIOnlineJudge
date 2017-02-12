import java.util.Scanner;
//import java.util.Locale;

public class Intervalo2{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int qnt = ler.nextInt();
   int n = 0;
   int in = 0;
   int out = 0;
   
   for(int i=0; i < qnt; i++){
      n = ler.nextInt();
      
      if( n > 9 && n < 21){
         in++;
      }else out++;
      
   }
   
   System.out.printf("%d in\n%d out\n",in,out);  
   
  
   }
}