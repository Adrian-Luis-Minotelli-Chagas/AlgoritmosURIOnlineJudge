import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//import java.util.Locale;
 
public class SequenciasCrescentes{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    int x;
    Integer n;
    while( (x = Integer.parseInt(br.readLine())) != 0){
    
       for(n=1; n <= x;n++){
         bw.write(n.toString());
         if (n != x) bw.write(" ");  
       }      
       bw.write("\n");
       bw.flush();   
   }   
   
        
    
  
    }
  
}