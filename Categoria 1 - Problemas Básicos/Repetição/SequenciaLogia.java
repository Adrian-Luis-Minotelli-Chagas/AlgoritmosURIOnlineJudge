import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class SequenciaLogia{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = ler.nextInt();
    int b = 1;
    int c = 1;
    
    for(int i = 1; i <= x;i++){
       b = i*i;
       c = i*i*i;
       System.out.printf("%d %d %d\n%d %d %d\n",i,b,c,i,++b,++c);
    }

   
        
    
  
    }
  
}