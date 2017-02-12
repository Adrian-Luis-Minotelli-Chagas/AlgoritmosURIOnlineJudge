import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//import java.util.Locale;
 
public class UltrapassandoZ{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    int a = Integer.parseInt(br.readLine());
    int n = 0;
    int aux = a;
    do{
      n = Integer.parseInt(br.readLine());
    }while( n <= a );
    
    
    for(Integer i = 2; i < n; i++){
      aux++;
      a += aux; 
      if(a > n){
         bw.write(i.toString());          
         bw.write("\n");
         bw.flush(); 
         break;
      }
    }
     
    
    
     
     
   
    }//FIM DA MAIN
  
}//FIM CLASS