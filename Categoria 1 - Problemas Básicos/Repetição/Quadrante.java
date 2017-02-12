import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class Quadrante{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     

    int x = 0;
    int y = 0;
    
    do{
      
     x = ler.nextInt(); 
     y = ler.nextInt();
   
   if( x == 0 || y == 0 ){
      break;
         
   }else if( x > 0){
      if( y > 0){
         System.out.printf("primeiro\n");
      }else System.out.printf("quarto\n");
   
   }else if( y > 0){
      System.out.printf("segundo\n");
   
   }else System.out.printf("terceiro\n");
      
    }while( true );
  
    }
  
}