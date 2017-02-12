import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class PUM{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = ler.nextInt();
    int pum = 0;
    for(int i = 0; i < x;i++){
      System.out.printf("%d %d %d PUM\n",++pum,++pum,++pum);
      pum++;
    }
   
        
    
  
    }
  
}