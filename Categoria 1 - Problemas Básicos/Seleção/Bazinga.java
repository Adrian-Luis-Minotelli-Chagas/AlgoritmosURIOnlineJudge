import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class Bazinga{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int t = Integer.parseInt(br.readLine())+1;
    String linha;
    String[] jogada;
    
    for(int i = 1; i < t; i++){
      linha = br.readLine();
      jogada = linha.split(" ");
      
      switch(jogada[0]){
         case "tesoura": switch(jogada[1]){
                           case "tesoura": bw.write("Caso #"+i+": De novo!\n");
                              break;
                           case "papel": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           case "pedra": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           case "lagarto": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           default: bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                         }
            break;
         case "papel": switch(jogada[1]){
                           case "tesoura": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           case "papel": bw.write("Caso #"+i+": De novo!\n");
                              break;
                           case "pedra": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           case "lagarto": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           default: bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                         }
            break;
         case "pedra": switch(jogada[1]){
                           case "tesoura": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           case "papel": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           case "pedra": bw.write("Caso #"+i+": De novo!\n");
                              break;
                           case "lagarto": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           default: bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                         }
            break;
         case "lagarto": switch(jogada[1]){
                           case "tesoura": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           case "papel": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           case "pedra": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           case "lagarto": bw.write("Caso #"+i+": De novo!\n");
                              break;
                           default: bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                         }
            break;
         default: switch(jogada[1]){
                           case "tesoura": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           case "papel": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           case "pedra": bw.write("Caso #"+i+": Bazinga!\n");
                              break;
                           case "lagarto": bw.write("Caso #"+i+": Raj trapaceou!\n");
                              break;
                           default: bw.write("Caso #"+i+": De novo!\n");
                              break;
                         }
            break;
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