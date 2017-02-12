import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class ACorridaDeLesmas{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int quantidade;
    String linha;
    String[] casos;
    int maior = 0;
    
   
    while(br.ready()){
      
      quantidade = Integer.parseInt(br.readLine());
      linha = br.readLine();
      casos = linha.split(" ");
      for(int i = 0; i < quantidade; i++)
         if(Integer.parseInt(casos[i]) > maior)
         maior = Integer.parseInt(casos[i]);
      
      if(maior < 10){
         bw.write("1\n");
      
      }else if(maior < 20){
         bw.write("2\n");
      
      }else bw.write("3\n");
      maior = 0; 
       
      }
      bw.flush();
    
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE