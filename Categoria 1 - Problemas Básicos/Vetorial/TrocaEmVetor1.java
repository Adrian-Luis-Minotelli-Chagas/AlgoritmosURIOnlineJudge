import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class TrocaEmVetor1{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Integer[] v = new Integer[20];
     
    for(Integer i = 19; i >= 0;i--){
      v[i] = Integer.parseInt(br.readLine());    
    }
    
    for(Integer i = 0; i < 20; i++){
      bw.write("N["+i.toString()+"] = "+v[i].toString()+"\n");
    }
    bw.flush();
      
                        
    
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE