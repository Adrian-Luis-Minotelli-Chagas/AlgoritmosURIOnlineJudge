import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class SequênciaDeNumerosESoma{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = 0;
    int y = 0;
    int sum = 0;
    
    while(true){
      
      x = ler.nextInt();
      y = ler.nextInt();
      
      if( x <=0 || y <= 0) break;
      
      if( x > y){
         for(; y <= x;y++){
            System.out.printf("%d ",y);
            sum +=y;
         }
         System.out.printf("Sum=%d\n",sum);
      }else{
         for(; x <= y;x++){
            System.out.printf("%d ",x);
            sum +=x;
         }
         System.out.printf("Sum=%d\n",sum);
      }
      
      sum = 0;
    }

  
    }
  
}