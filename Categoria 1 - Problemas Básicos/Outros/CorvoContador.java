import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class CorvoContador{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String corvoAcao;
    int piscadas = 0;
    int numero = 0;
    
    while(piscadas < 3){
      corvoAcao = br.readLine();
      
      if(corvoAcao.equals("caw caw")){
         bw.write(numero+"\n");
         numero = 0;
         piscadas++;
      }else{
         if(corvoAcao.substring(0,1).equals("*")) numero +=4;
         if(corvoAcao.substring(1,2).equals("*")) numero +=2;
         if(corvoAcao.substring(2,3).equals("*")) numero +=1;
      }
    }
    bw.flush();
    
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE