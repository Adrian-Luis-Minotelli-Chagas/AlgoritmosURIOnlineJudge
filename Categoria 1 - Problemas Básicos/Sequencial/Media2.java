import java.util.Scanner;

public class Media2{
   public static void main(String[] args){
   
   Scanner ler = new Scanner(System.in);
       
   System.out.printf("MEDIA = %.1f\n",( 
   ( ler.nextDouble()*2 ) + ( ler.nextDouble()*3 )+ ( ler.nextDouble()*5 ) )/10 );
   
   }
}