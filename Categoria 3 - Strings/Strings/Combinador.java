import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class Combinador{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    String[] linha;
     
    String[] l1;
    String[] l2;
     
    int tam1 = 0;
    int tam2 = 0;
    int k;
    int n = Integer.parseInt(br.readLine());
     
    for(int i = 0; i < n; i++){
      linha = br.readLine().split(" ");

      l1 = linha[0].split("");
      l2 = linha[1].split("");
      
      tam1 = l1.length;
      tam2 = l2.length;
       
      if(tam1 > tam2){
          
         for(k = 0; k < tam2; k++){
            bw.write(l1[k]+l2[k]);
         }
       
         for(; k < tam1; k++) bw.write(l1[k]);
       
      }else{
          
         for(k = 0; k < tam1; k++){
            bw.write(l1[k]+l2[k]);
         }
       
         for(; k < tam2; k++) bw.write(l2[k]);
       
      }
       
 
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

