import java.util.Scanner;
//import java.util.Locale;

public class SomaDeParesConsecutivos1{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int num = ler.nextInt();
   int num2 = ler.nextInt();
   int soma = 0;
   
   if(num > num2){

      for(num2+=1;num2 < num; num2++){
         if( num2%2 != 0) soma +=num2;
      } 
   }else{
      for(num+=1;num < num2; num++){
         if( num%2 != 0) soma +=num;
      }
   }
   
   System.out.printf("%d\n",soma);  
   
  
   }
}