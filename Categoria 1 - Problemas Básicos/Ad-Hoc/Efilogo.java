import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class Efilogo{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String[] frase;
    String anterior = "";
    int tam = 0;
    
    while(br.ready()){
    
      frase = br.readLine().split("");
    
      tam = frase.length;
    
      for(int i = 0; i < tam; i++){
         
         switch(frase[i]){
            
            case "P": 
            case "S": 
            case "V": 
            case "X": 
            case "J": 
            case "B": 
            case "F":
            case "Z": if(!anterior.equalsIgnoreCase("f")){
                            bw.write("F");
                            anterior = "F";
                        } 
                      break;
            case "p": 
            case "s": 
            case "v": 
            case "x":
            case "j": 
            case "b": 
            case "z": 
            case "f": if(!anterior.equalsIgnoreCase("f")){
                            bw.write("f");
                            anterior = "f";
                        }
                      break;
            default: bw.write(frase[i]); 
                     anterior = frase[i]; 
                     break;
            
         }
        
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

