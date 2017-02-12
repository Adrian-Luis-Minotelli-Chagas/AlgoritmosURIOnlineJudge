import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class SubstituicaoEmVetor{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Integer[] v = new Integer[10];
    int n = 0;
    for(Integer i = 0; i < 10; i++ ){
      n = Integer.parseInt(br.readLine());
      if( n < 1 ){
         v[i] = 1;
      }else v[i] = n;
      
      bw.write("X["+i.toString()+"] = "+v[i].toString()+"\n");
      
      bw.flush();
      
    }
                        
    
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE