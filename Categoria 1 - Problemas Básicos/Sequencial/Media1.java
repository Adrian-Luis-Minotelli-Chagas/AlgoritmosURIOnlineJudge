import java.util.Scanner;

public class Media1{
   public static void main(String[] args){
   
   Scanner ler = new Scanner(System.in);
       
   System.out.printf("MEDIA = %.5f\n",( ( ler.nextDouble()*3.5 ) + ( ler.nextDouble()*7.5 ) )/11 );
   
   }
}