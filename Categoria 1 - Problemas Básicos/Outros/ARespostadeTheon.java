import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class ARespostadeTheon{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    String[] pessoas = br.readLine().split(" ");
    int pos = 1;
    int menor = Integer.parseInt(pessoas[0]);
    for(int i = 1; i < n ; i++){
      if( Integer.parseInt(pessoas[i]) < menor ){
         pos = i+1;
         menor = Integer.parseInt(pessoas[i]);
      }
    }
    
    bw.write(pos+"\n");
    bw.flush();
    
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE