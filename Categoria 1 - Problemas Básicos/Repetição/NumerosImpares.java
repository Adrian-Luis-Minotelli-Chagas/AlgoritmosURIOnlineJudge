import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  
    public static void main(String[] args) throws IOException {
  
    Scanner ler = new Scanner(System.in);
    
    int num = ler.nextInt();
     
    for(int i = 1; i <= num; i+=2) System.out.printf("%d\n",i);
     
  
    }
  
}