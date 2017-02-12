import java.io.IOException;
import java.util.Scanner;
//import java.util.Locale;
 
public class SenhaFixa{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int x = 0;
    
    do{
      
      x = ler.nextInt();
      
      if(x == 2002){
         System.out.printf("Acesso Permitido\n");
      }else System.out.printf("Senha Invalida\n");
    
    }while( x != 2002);
  
    }
  
}