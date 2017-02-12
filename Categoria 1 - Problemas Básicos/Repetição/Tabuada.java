import java.util.Scanner;
//import java.util.Locale;

public class Tabuada{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int n = ler.nextInt();
  
   for(int i=1; i < 11; i++) System.out.printf("%d x %d = %d\n",i,n,i*n);
   
   
  
   }
}