import java.util.Scanner;
//import java.util.Locale;

public class ParesEntreCincoNumero{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   int cont = 0;
   
   for(int i = 0; i < 5; i++){
      if( Math.abs(ler.nextInt())%2 == 0 ) cont++;
   }

   System.out.printf("%d valores pares\n",cont);
     
   }
}