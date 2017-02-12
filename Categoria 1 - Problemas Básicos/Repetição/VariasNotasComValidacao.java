import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class VariasNotasComValidacao{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int n = 0;
    int z = 1;
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
      
      if( n == 2){
         System.out.printf("media = %.2f\n",soma/2.0);
         
         do{
            System.out.printf("novo calculo (1-sim 2-nao)\n");
            z = ler.nextInt();
         }while( z < 1 || z > 2);
         n=0;
         soma=0.0;
         
      }
      
    }while(z != 2);
    
    
  
    }
  
}