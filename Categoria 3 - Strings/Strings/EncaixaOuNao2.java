import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class EncaixaOuNao2{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    int n = Integer.parseInt(br.readLine());
    int tam = 0;
    int tam2 = 0;
    int maior = 0;
    boolean controle = false;
    String[] linha;
    String[] l1;
    String[] l2;
    
    for(int i = 0; i < n; i++){
      
      linha = br.readLine().split(" ");
      
      l1 = linha[0].split("");

      l2 = linha[1].split("");
      
      tam = l1.length-1;
      tam2 = l2.length-1;


      if(tam >= tam2){
         
         for(int w = tam2; w >=0; w--){
            if(l1[tam].equals(l2[w])){
            controle = true;
            }else{
               controle = false;
               break;
            }
            tam--;
         }
            
      }else{
         controle = false;
      
      }
 
      if(controle){
         bw.write("encaixa\n");
      }else bw.write("nao encaixa\n");
      controle = false;
    }
    
    bw.flush();
    
    
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

