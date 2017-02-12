import java.util.Scanner;
//import java.util.Locale;

public class Resto2{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int n = ler.nextInt();
  
   for(int i=2; i < 10001; i++) if(i%n == 2) System.out.printf("%d\n",i);
   
   
  
   }
}