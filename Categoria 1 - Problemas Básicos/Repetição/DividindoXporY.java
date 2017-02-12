import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class DividindoXporY{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int n = ler.nextInt();
    
    int x = 0;
    int y = 0;
    
    for(int i =0; i < n; i++){
    
      x=ler.nextInt();
      y=ler.nextInt();
      
      if( y == 0){
         System.out.printf("divisao impossivel\n");
      
      }else{
         System.out.printf("%.1f\n",(float)x/y);
      
      }
    }
  
    }
  
}