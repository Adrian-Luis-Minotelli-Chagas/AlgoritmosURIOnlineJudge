import java.io.IOException;
//import java.util.Scanner;
//import java.util.Locale;
 
public class SequenciaIJ2{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);

     
    int j = 7;
    
    for(int i = 1; ;j--){
      if(j == 4){
         j = 7;
         i+=2;
         if(!(i < 10))break;
      }
      System.out.printf("I=%d J=%d\n",i,j);
      
    }
   
  
    }
  
}