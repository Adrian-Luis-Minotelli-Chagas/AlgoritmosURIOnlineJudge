import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class HaMuitoMuitoTempoAtras{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    
    int anosPas;
    
    for(int i = 0; i < n; i++){
      anosPas = Integer.parseInt(br.readLine());
      
      if(anosPas <= 2014){
         anosPas = Math.abs(2015 - anosPas);
         bw.write(anosPas+" D.C.\n");
      }else{
         anosPas = Math.abs(2015 - anosPas)+1;        
         bw.write(anosPas+" A.C.\n");    
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

