import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class SelecaoEmVetor1{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    double[] v = new double[100];
     
    for(Integer i = 0; i < 100;i++){
      v[i] = Double.parseDouble(br.readLine());
      
      if(v[i] < 11){
         System.out.printf("N[%d] = %.1f\n",i,v[i]);
           
      }      
    }
    //bw.write("N["+i.toString()+"] = "+v[i].toString()+"\n");
    //bw.flush();
      
                        
    
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE