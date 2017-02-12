import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;
 
public class Idades{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   
    Integer n = 1;
    
    int media = 0;
    int count = 0;
    String total = "";
    n = Integer.parseInt(br.readLine());
    while(n >= 0){
      if( n != 0){
         media += n;
         count++;
      }
      n = Integer.parseInt(br.readLine());
    }
    
    System.out.printf("%.2f\n",(float)media/count);                       
    //bw.write("\n");
    //bw.flush();
    



     
    
    
     
     
   
    }//FIM DA MAIN
  
}//FIM CLASS