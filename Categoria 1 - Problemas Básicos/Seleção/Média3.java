import java.util.Scanner;
import java.util.Locale;

public class Média3{
   public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   float n = ler.nextFloat()*2; 
   n += ler.nextFloat()*3;
   n += ler.nextFloat()*4;
   n += ler.nextFloat();
   n = n/10;
   
   System.out.printf("Media: %.1f\n",n);
   if( n >= 7.0){
      System.out.printf("Aluno aprovado.\n");
      
   }else if(n < 5.0){
      System.out.printf("Aluno reprovado.\n");
   
   }else {
      float exame = ler.nextFloat();
      System.out.printf("Aluno em exame.\n");
      System.out.printf("Nota do exame: %.1f\n",exame);
      n = (n+exame)/2;
      if(n >= 5.0){
         System.out.printf("Aluno aprovado.\n");
      }else System.out.printf("Aluno reprovado.\n");
      System.out.printf("Media final: %.1f\n",n);
      
   }
   

   
   
   
   }
}