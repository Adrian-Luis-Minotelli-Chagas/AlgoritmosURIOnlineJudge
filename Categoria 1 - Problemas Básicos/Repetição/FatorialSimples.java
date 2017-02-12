import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//import java.util.Locale;
 
public class FatorialSimples{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    Integer n = Integer.parseInt(br.readLine());
    
    for(int i = n-1; i > 0; i-- ){
      n *=i;
    }    
    bw.write(n.toString());                    
    bw.write("\n");
    bw.flush();
    



     
    
    
     
     
   
    }//FIM DA MAIN
  
}//FIM CLASS