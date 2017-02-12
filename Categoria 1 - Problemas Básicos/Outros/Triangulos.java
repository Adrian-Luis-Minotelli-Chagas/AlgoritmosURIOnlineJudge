import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class Triangulos{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] n = br.readLine().split(" ");
    String controle = "N";
    int[] varetas = new int[4];
    
    for(int i = 0; i < 4; i++){
      varetas[i] = Integer.parseInt(n[i]);
    }
    
    for(int i = 0; i < 2; i++){
      for(int k = 1; k < 3; k++){
         for(int l = 2; l < 4; l++){
           if(i != k && i != l && k != l){
            if( ( (varetas[i]+varetas[k] > varetas[l]) && (varetas[k]+varetas[l] > varetas[i]) && (varetas[i]+varetas[l] > varetas[k]) ) ){ 
               controle = "S";
            }
           }
         }
      }
    } 
      
    bw.write(controle+"\n");
    bw.flush();  
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

