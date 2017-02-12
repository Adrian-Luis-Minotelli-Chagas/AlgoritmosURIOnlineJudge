import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class AtalhosBloggo{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    int controleI = 0;
    int controleB = 0;
    int tam = 0;
    int caracter = 0;
    String texto = "";
    
    while(br.ready()){
    
      texto = br.readLine();
      
      tam = texto.length();
      
      for(int i = 0; i < tam; i++){
         caracter = texto.charAt(i);   
         
         if(caracter == 95){
            
            if(controleI == 0){
               bw.write("<i>");
               controleI = 1;
            }else{
               bw.write("</i>");
               controleI = 0;
            }
         
         }else if(caracter == 42){
            if(controleB == 0){
               bw.write("<b>");
               controleB = 1;
            }else{
               bw.write("</b>");
               controleB = 0;
            }
         
         }else bw.write((char)caracter);
         
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

