import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class TheWinterIsComing{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] valores = br.readLine().split(" ");
    
    int a = Integer.parseInt(valores[0]);
    int b = Integer.parseInt(valores[1]);
    int c = Integer.parseInt(valores[2]);
    
    if( b > a){
      if(c <= b){
         bw.write(":(\n");
      }else{
         
         if( Math.abs(c-b) < Math.abs(b-a)){
            bw.write(":(\n");
         }else bw.write(":)\n");
         
      }
    }else if(b < a){
      if( c >= b ){
         bw.write(":)\n");
      
      }else{
         if( Math.abs(b-a) > Math.abs(c-b) ){
            bw.write(":)\n");
         }else bw.write(":(\n");
      }
    
    }else{
      if( c > b){
         bw.write(":)\n");
      }else bw.write(":(\n");
    
    }
    
    bw.flush();  
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

