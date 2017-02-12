import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;
 
public class SomaDeParesConsecutivos3{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   
    long n = Long.parseLong(br.readLine());
    
    long total = 0;
     
    while(n != 0){
      
      if(n%2 != 0) n+=1;
    
      for(int i = 0; i < 5; i++){
         total +=n;
         n+=2;
      }
      System.out.printf("%d\n",total);
      total = 0;
      n = Long.parseLong(br.readLine());
    }
    
    
    }//FIM DA MAIN
  
}//FIM CLASS