import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class NotacaoCientifica{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int aux = 0;
    int tam = 0;
    String n = br.readLine();
    
    if(n.substring(0,1).equals("-")){
      bw.write("-");
      n = n.substring(1,n.length());
    }else bw.write("+");   
    tam = n.length();
    bw.write(String.format("%.4E", Double.parseDouble(n)));
    bw.newLine();
    bw.flush();  
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

