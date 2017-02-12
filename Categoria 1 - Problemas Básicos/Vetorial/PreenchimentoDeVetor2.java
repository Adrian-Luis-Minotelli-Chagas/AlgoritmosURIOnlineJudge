import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class PreenchimentoDeVetor2{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    //Integer[] n = new Integer[1000];

     
    int n = Integer.parseInt(br.readLine());
    Integer saida = 0;
    
    for(Integer i = 0; i < 1000; i++){
      if(saida == n) saida = 0;
      bw.write("N["+i.toString()+"] = "+saida.toString()+"\n"); 
      bw.flush();
      saida++;
    }      
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE