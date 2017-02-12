import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class SequenciaLogia2{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = ler.nextInt();
    int y = ler.nextInt();
    
    
    for(int n = 1; n <= y;){
         for(int j = 1; j <= x;j++){
            if(j == x && n <= y){
               System.out.printf("%d\n",n++);
            }else if (n <= y) System.out.printf("%d ",n++);
            
         }
    }

   
        
    
  
    }
  
}