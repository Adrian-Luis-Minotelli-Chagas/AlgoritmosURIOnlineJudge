import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class MultiplosDe13{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
    int soma = 0;
     
    int x = 0;
    int y = 0;
    
    x = ler.nextInt();
    y = ler.nextInt();
    
    if (x > y){
      for (; y <= x; y++)if(y%13 != 0)soma+=y;  
      
    
    }else{
      for (; x <= y; x++)if(x%13 != 0)soma+=x; 
    }
    
    System.out.printf("%d\n",soma);
  
    }
  
}