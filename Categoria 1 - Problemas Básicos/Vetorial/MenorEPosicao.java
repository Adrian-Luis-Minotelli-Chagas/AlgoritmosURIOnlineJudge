import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class MenorEPosicao{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    Integer[] x = new Integer[n];
    String[] l = new String[n];
    
    String linha = br.readLine();
    
    l = linha.split(" ");
    
    for(int k = 0; k < n; k++){
      x[k] = Integer.parseInt(l[k]);
    }
    
    Integer menor = x[0];
    Integer pos = 0;
    
    for(int i = 1; i < n; i++){
      if(x[i] < menor){
         menor = x[i];
         pos = i;
      } 
    }

    bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    bw.flush();

    }//FIM METODO MAIN
  
}//FIM DA CLASSE