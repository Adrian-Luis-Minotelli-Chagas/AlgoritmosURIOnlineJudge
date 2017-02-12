import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//import java.util.Locale;
 
public class SomandoInteirosConsecutivos{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
    
   
    int a = ler.nextInt();
    int n = 0;
    int aux = a;
    do{
      n = ler.nextInt();
    }while( n <= 0 );
    
    
    for(int i = 1; i < n; i++){
      aux++;
      a += aux; 
    }
    System.out.printf("%d\n",a); 
    
    
     
     
   
    }//FIM DA MAIN
  
}//FIM CLASS