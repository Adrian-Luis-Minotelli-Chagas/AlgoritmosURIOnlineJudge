import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class DeQuemEhAVez{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    
    String[] jogadoresEescolhas;
    String[] numeros;
    long total = 0;
    String controle = "";
    
    for(; n > 0 ; n--){
      
      jogadoresEescolhas = br.readLine().split(" ");
      numeros = br.readLine().split(" ");
      total = Long.parseLong(numeros[0]);
      total += Long.parseLong(numeros[1]);
      
      if(total%2 == 0){
          controle = "PAR";
      }else controle = "IMPAR";
      
      if(jogadoresEescolhas[1].equals(controle)){
         bw.write(jogadoresEescolhas[0]+"\n");
      }else bw.write(jogadoresEescolhas[2]+"\n");
      
      total = 0;
      
    }
    
    
    bw.flush();
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

