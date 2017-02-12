import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class PreenchimentoDeVetor3{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    //Integer[] n = new Integer[1000];

     
    double n = Double.parseDouble(br.readLine());   
    for(Integer i = 0; i < 100; i++){
      System.out.printf("N[%d] = %.4f\n",i,n);
      n /=2.0;
      //bw.write("N["+i.toString()+"] = "+saida.toString()+"\n"); 
      //bw.flush();

    }      
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE