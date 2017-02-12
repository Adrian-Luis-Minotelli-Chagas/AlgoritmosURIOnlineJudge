import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class DeDentroParaFora{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String linha;
    int tam = 0;
    int metade = 0;
    
    int n = Integer.parseInt(br.readLine());
    
    for(int i = 0; i < n; i++){
      linha = br.readLine();
      
      tam = linha.length();
      metade = tam/2;
      
      for(int k = metade; k > 0; k--) 
         bw.write(linha.substring(k-1,k));
      
      for(int j = tam; j > metade; j--)
         bw.write(linha.substring(j-1,j));

      bw.newLine();
    }
    bw.flush();
    
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

