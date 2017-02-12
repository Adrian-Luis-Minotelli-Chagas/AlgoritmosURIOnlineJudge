import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;
 
public class SomaDeImparesConsecutivos3{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   
    int n =  ler.nextInt();
    Integer total = 0;
    
    int x = 0;
    int y = 0;
    
    for(int i = 0; i < n; i++){
      x =  ler.nextInt();
      y =  ler.nextInt();
      
      if(x%2 == 0){
         x+=1;
      }
      
      for(int j = 0; j < y; j++){
            total +=x;
            x+=2;
         }
      bw.write(total.toString()+"\n");
      bw.flush();
      total = 0;
    }
      
      
    
    

    }//FIM DA MAIN
  
}//FIM CLASS