import java.util.Scanner;
//import java.util.Locale;

public class MaiorEPosicao{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int pos = 1;
   
   
   int x = ler.nextInt();
   int n = x;
   int y = 0;
  
   for(int i=2; i < 101; i++){   
      
      y = ler.nextInt();
      if( y > n){
         n = y;
         pos = i;
      }
      x = y;
      y = 0;
   }
   System.out.printf("%d\n%d\n",n,pos);
  
   }
}