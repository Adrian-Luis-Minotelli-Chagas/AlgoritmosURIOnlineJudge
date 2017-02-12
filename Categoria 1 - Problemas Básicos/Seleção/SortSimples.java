import java.util.Scanner;
//import java.util.Locale;

public class SortSimples{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   int a = ler.nextInt(); 
   int b = ler.nextInt();
   int c = ler.nextInt();
   
   
   if( a <= b && a <=c){
      System.out.printf("%d\n",a);
      if(b <= c){
         System.out.printf("%d\n",b);
         System.out.printf("%d\n",c);
      }else{
             System.out.printf("%d\n",c);
             System.out.printf("%d\n",b);
            }
   }else if(b <= c && b <=a){
      System.out.printf("%d\n",b);
      if(a <= c){
         System.out.printf("%d\n",a);
         System.out.printf("%d\n",c);
      }else{
             System.out.printf("%d\n",c);
             System.out.printf("%d\n",a);
            }
   
   }else{
      System.out.printf("%d\n",c);
      if(a <= b){
         System.out.printf("%d\n",a);
         System.out.printf("%d\n",b);
      }else{
             System.out.printf("%d\n",b);
             System.out.printf("%d\n",a);
            }
   }
   
   System.out.printf("\n%d\n",a);
   System.out.printf("%d\n",b);
   System.out.printf("%d\n",c);

   }
}