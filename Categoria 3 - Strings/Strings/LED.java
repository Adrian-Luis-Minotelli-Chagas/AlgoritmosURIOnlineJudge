import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class LED{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    String[] numero;
    int tam = 0;
    int tatalLeds = 0;
    
    for(int i = 0; i < n; i++){
         numero = br.readLine().split("");
         tam = numero.length;
         for(int k = 0; k < tam; k++){
            //System.out.printf("%s  <<<< teste na posicao = %d\n",numero[k],k);
            switch(numero[k]){
                  case "1": tatalLeds += 2;
                  break;
                  case "2":
                     case "3": 
                        case "5": tatalLeds +=5;
                  break;
                  case "4": tatalLeds +=4;
                  break;
                  case "7": tatalLeds +=3;
                  break;
                  case "0": 
                     case "6": 
                        case "9": tatalLeds +=6;
                  break;
                  case "8": tatalLeds +=7;
                  break;
            }
         }
         bw.write(tatalLeds+" leds\n");
         tatalLeds = 0;
    }
   
    bw.flush();
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

