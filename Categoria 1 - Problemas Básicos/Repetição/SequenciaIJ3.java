import java.io.IOException;
//import java.util.Scanner;
//import java.util.Locale;
 
public class SequenciaIJ3{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);

     
    int j = 7;
    int cont = 0;
    
    for(int i = 1; ;j--){
      if(cont == 3){
         cont = 0;
         j += 5;
         i+=2;
         if(!(i < 10))break;
      }
      System.out.printf("I=%d J=%d\n",i,j);
      cont++;
    }
   
  
    }
  
}