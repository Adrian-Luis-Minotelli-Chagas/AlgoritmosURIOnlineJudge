import java.util.Scanner;
//import java.util.Locale;

public class ParesImparesPositivosNegativos{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int num = 0;
   int contP = 0;
   int contI = 0;
   int contPo = 0;
   int contNe = 0;
   
   for(int i = 0; i < 5; i++){
      num = ler.nextInt();
      if( Math.abs(num)%2 == 0){
         contP++;
      }else contI++;
      
      if (num > 0){
         contPo++;
      }else if(num != 0) contNe++;
   }

   System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",contP,contI,contPo,contNe);
     
   }
}