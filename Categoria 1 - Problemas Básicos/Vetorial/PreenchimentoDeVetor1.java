import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class PreenchimentoDeVetor1{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    Integer[] v = new Integer[10];
    v[0] = Integer.parseInt(br.readLine());
     
    bw.write("N[0] = "+v[0]+"\n");
     
    for(Integer i = 1; i < 10;i++){
      v[i] = v[i-1]*2;
      bw.write("N["+i.toString()+"] = "+v[i]+"\n");
    }
     
    bw.flush();
      
                        
    
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE