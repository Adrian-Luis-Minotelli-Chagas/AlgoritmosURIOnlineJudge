import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class TipoDeCombustivel{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = 0;
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    
    do{
      do{
         x = ler.nextInt();
      }while(x < 1 && x > 4);
      
      switch(x){
         case 1:alcool++;
            break;
         case 2:gasolina++;
            break;
         case 3:diesel++;
            break;
      }
      
    }while(x != 4);
    
    System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n",alcool,gasolina,diesel);
    
        
    
  
    }
  
}