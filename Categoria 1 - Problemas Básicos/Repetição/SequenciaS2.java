import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;
 
public class SequenciaS2{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   
    double n = 1.0;
    int a = 3;
    int b = 2;
    
    for(; a <= 39;){
      n += (double)a/b;
      a+=2;
      b*=2;
    }
    System.out.printf("%.2f\n",n);  
                           
    //bw.write("\n");
    //bw.flush();
    

    }//FIM DA MAIN
  
}//FIM CLASS