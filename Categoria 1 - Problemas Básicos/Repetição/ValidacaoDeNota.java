import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class Varias Notas Com Validação{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int n = 0;
    double x = 0.0;
    double soma = 0.0;
    
    do{
      x=ler.nextDouble();

      
      if(x < 0.0 || x > 10.0 ){
         System.out.printf("nota invalida\n");
      }else{
         n+=1;
         soma+=x;
      }
 
    }while(n < 2);
    
    System.out.printf("media = %.2f\n",soma/2.0);
  
    }
  
}