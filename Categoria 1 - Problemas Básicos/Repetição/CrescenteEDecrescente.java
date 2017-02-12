import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class CrescenteEDecrescente{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = 0;
    int y = 0;
    
    while(true){
      
      x = ler.nextInt();
      y = ler.nextInt();
      
      if( x == y) break;
      
      if( x > y){
         System.out.printf("Decrescente\n");
      }else{
         System.out.printf("Crescente\n");
      }
      

    }

  
    }
  
}