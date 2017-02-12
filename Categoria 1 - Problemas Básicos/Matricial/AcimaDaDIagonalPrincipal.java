import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class AcimaDaDIagonalPrincipal{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    double[][] matriz = new double[12][12];
    //int l = Integer.parseInt(br.readLine());
    String operacao = br.readLine();
    double total = 0.0;
    
    for(int i = 0; i < 12; i++){
      for(int k = 0; k < 12; k++){
         matriz[i][k] = Double.parseDouble(br.readLine());
      }
    }
    
    for(int i = 0; i < 12; i++) 
         for(int k = i+1; k < 12; k++)total +=matriz[i][k];
    
    if(operacao.equals("M")){
      total = total/66.0;
    
    }
      
    System.out.printf("%.1f\n",total);
    
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.flush();

    }//FIM METODO MAIN
  
}//FIM DA CLASSE