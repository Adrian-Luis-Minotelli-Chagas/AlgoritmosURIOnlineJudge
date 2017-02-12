import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class QuadradoEAoCubo{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = ler.nextInt();

    for(int i = 1; i <= x;i++) System.out.printf("%d %d %d\n",i,i*i,i*i*i);

   
        
    
  
    }
  
}