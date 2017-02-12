import java.util.Scanner;
import java.util.Locale;

public class IdadeEmDias{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int idade = ler.nextInt();
   int dias = idade/365;
      
   System.out.printf("%d ano(s)\n",dias);
   
   idade -=dias*365;
   dias = idade/30;
   System.out.printf("%d mes(es)\n",dias);
   
   idade -=dias*30;
   System.out.printf("%d dia(s)\n",idade);
   }
}