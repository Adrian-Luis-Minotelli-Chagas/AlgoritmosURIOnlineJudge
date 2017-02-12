import java.util.Scanner;
//import java.util.Locale;

public class TempoDeJogo{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   int a = ler.nextInt(); 
   int b = ler.nextInt();
   
   if( a >= b){
      System.out.printf("O JOGO DUROU %d HORA(S)\n",24-a+b);   
      
   }else{
       System.out.printf("O JOGO DUROU %d HORA(S)\n",b-a);
   }
   
   }
}