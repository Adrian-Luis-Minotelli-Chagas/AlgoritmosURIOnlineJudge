import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class PulaSapo{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] dadosIniciais = br.readLine().split(" ");
    
    String[] alturaCanos = br.readLine().split(" ");
    
    int puloSapo = Integer.parseInt(dadosIniciais[0]);
    int numCanos = Integer.parseInt(dadosIniciais[1])-1;
    String status = "YOU WIN";
    
    for(int i = 0; i < numCanos; i++){
      if( !( puloSapo >= Math.abs( Integer.parseInt(alturaCanos[i+1])-Integer.parseInt(alturaCanos[i]) ) )  ){
         status = "GAME OVER";
         break;
      }
    }
    
    bw.write(status+"\n");
    bw.flush();  
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

