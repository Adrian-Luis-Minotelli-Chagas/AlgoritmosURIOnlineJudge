import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class DomingoDeManha{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    String h = "";
    int horas = 0;
    int minutos = 0;
        
    while(br.ready()){    
    
      h = br.readLine();
      
      horas = Integer.parseInt(h.substring(0,1));
      minutos = Integer.parseInt(h.substring(2,4));
      
      if(horas < 7){
         
         bw.write("Atraso maximo: 0\n");
      
      }else if(horas == 7){
         
         bw.write("Atraso maximo: "+minutos+"\n");        
      
      }else if(horas == 8){
         minutos +=60;
         bw.write("Atraso maximo: "+minutos+"\n");
      }else{
      
         bw.write("Atraso maximo: 120\n");
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

