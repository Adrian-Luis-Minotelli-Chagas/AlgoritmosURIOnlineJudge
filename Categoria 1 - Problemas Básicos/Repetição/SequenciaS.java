import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;
 
public class SequenciaS{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   
    double n = 1.0;
    
    for(int i = 2 ; i < 101; i++){
      n += (float)1/i;
    }
    System.out.printf("%.2f\n",n);  
                           
    //bw.write("\n");
    //bw.flush();
    



     
    
    
     
     
   
    }//FIM DA MAIN
  
}//FIM CLASS