import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class RevisaoDeContrato{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] parametros = br.readLine().split(" ");
    String valor = "";
    String novoValor = "";
    String val = parametros[1];
    int falha = parametros[0].charAt(0);
    int tam = 0;
    
    while( !(parametros[1].equals("0") && parametros[0].equals("0")) ){
      
      tam = parametros[1].length();
      
      for(int i = 0; i < tam; i++){
         if(val.charAt(i) != falha)
            valor += parametros[1].substring(i,i+1);
      }
      int tamVal = valor.length();
      for(int k = 0; k < tamVal; k++){
         if(valor.charAt(k) != 48){
            novoValor += valor.substring(k,tamVal);
            break; 
         }
            
      }
      
      if(novoValor.equals("")){
         bw.write("0\n");
      }else bw.write(novoValor+"\n");
      novoValor = "";
      
      parametros = br.readLine().split(" ");
      val = parametros[1];
      falha = parametros[0].charAt(0);
      valor = "";    
    }
       
    bw.flush();
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

