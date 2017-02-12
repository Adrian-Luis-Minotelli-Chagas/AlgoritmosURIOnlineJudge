import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class Criptografia{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    String palavra = "";
    int tam = 0;
    int cont = 0;
    int reverso = 0;
    int[] letras;
    
    for(int i = 0; i < n; i++){
       
       palavra = br.readLine();
       tam = palavra.length();
       letras = new int[tam];
       cont = tam-1;

       for(int k = 0; k < tam;k++){
          letras[cont] = palavra.charAt(k);
          if( (letras[cont] >=65 && letras[cont] <=90) || (letras[cont] >=97 && letras[cont] <=122) )
            letras[cont] +=3;  
          cont--;
                
       }
       int r = 0;
       if(tam%2 == 0){
         r = tam/2;
       }else r = (tam-1)/2;
       for(; r < tam; r++) letras[r] -=1;
       
       for(int t = 0; t < tam; t++)
          bw.write((char)letras[t]);        

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

