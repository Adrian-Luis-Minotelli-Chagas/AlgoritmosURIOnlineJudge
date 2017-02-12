import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//import java.util.Locale;
 
public class FibonacciFacil{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int n = Integer.parseInt(br.readLine());
    
    int aux = 1;
    int aux2 = 1;
    Integer aux3 = 0;
    
    if( n == 1){
      bw.write("0");
      bw.write("\n");
      bw.flush();
    
    }else if(n == 2){
      bw.write("0 1");
      bw.write("\n");
      bw.flush();
    
    }else if(n == 3){
      
      bw.write("0 1 1");
      bw.write("\n");
      bw.flush();
    
    }else{
      bw.write("0 1 1");
      for(int i = 3; i < n; i++){
         aux3 = aux+aux2;
         aux = aux2;
         aux2 = aux3;
         bw.write(" ");
         bw.write(aux3.toString());                
      }          
      bw.write("\n");
      bw.flush();
    
    }


     
    
    
     
     
   
    }//FIM DA MAIN
  
}//FIM CLASS