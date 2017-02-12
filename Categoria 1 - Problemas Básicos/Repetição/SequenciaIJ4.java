import java.util.Scanner;
import java.util.Locale;
 
public class SequenciaIJ4{
  
    public static void main(String[] args){
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);

     
    double j = 1;
    int cont = 0;
    double i = 0;
    int apresentacao = 15;
    
    do{
      if(cont == 3){
         cont = 0;
         j -= 3.0;
         j += 0.2;
         i+=0.2;
         if(!(i < 2))break;
      }
      
      if(apresentacao > 12){
         System.out.printf("I=%.0f J=%.0f\n",i,j);
      
      }else System.out.printf("I=%.1f J=%.1f\n",i,j);
      
      if(apresentacao == 1){
         apresentacao = 15;
      }else apresentacao--;
      
      j +=1.0;
      cont++;
      
    }while(i < 2.2);
   
  
    }
  
}