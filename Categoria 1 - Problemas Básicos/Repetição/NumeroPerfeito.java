import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class NumeroPerfeito{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int t = Integer.parseInt(br.readLine());
    Integer num = 0;
    int total = 0;
    
    for(int i = 0; i < t; i++){
      num = Integer.parseInt(br.readLine());  
      
      for(int j = 1; j < num;j++){
         if(num%j == 0) total+=j;
      }
      
      if(total == num){
         bw.write(num.toString()+" eh perfeito\n");
      }else bw.write(num.toString()+" nao eh perfeito\n");
      
      bw.flush();
      total = 0;
    }
       
    
                            
    
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE