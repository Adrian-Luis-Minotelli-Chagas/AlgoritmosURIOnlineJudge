import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class RestoDaDivisao{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = 0;
    int y = 0;
    
    x = ler.nextInt();
    y = ler.nextInt();
    
    if (x > y){
      for (y+=1; y < x; y++)if(y%5 == 2 || x%5 == 3)System.out.printf("%d\n",y); 
      
    
    }else{
      for (x+=1; x < y; x++)if(x%5 == 2 || x%5 == 3)System.out.printf("%d\n",x); 
    }
    
    
  
    }
  
}