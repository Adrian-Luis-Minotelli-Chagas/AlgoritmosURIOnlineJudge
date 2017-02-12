import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class SentencaDancante{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String linha =" ";
    
    int tam = 0;
    int controle = 0;
    int letra = 0;
    int saida;

    while(br.ready()){
        linha = br.readLine();
        tam = linha.length();
        saida = 1;    
        for(int i = 0; i < tam; i++){
            letra = linha.charAt(i);
            if( linha.charAt(i) != 32){
               
               if( saida == 0 ){
                  if( linha.charAt(i) >= 65 && linha.charAt(i) <= 90 ){                 
                     letra = linha.charAt(i)+32;   
                  }
                  saida = 1;
               }else{
                  if( linha.charAt(i) >= 97 && linha.charAt(i) <= 122 ){                 
                     letra = linha.charAt(i)-32;   
                  }
                  saida = 0;
               }
               
               bw.write((char)letra);
            
            }else bw.write(" ");
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

