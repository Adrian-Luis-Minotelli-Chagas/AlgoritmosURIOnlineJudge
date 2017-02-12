import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class MacPRONALTS{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int quant = Integer.parseInt(br.readLine());
    
    double total = 0.0;
    
    for(int i = 0; i < quant; i++){
      String[] n = br.readLine().split(" ");
      
      switch(n[0]){
         case "1001": total +=1.50*Double.parseDouble(n[1]);
            break;
         case "1002": total +=2.50*Double.parseDouble(n[1]);
            break;
         case "1003": total +=3.50*Double.parseDouble(n[1]);
            break;
         case "1004": total +=4.50*Double.parseDouble(n[1]);
            break;
         default: total +=5.50*Double.parseDouble(n[1]);
            break;
      }
      
    }
    bw.write(String.format("%.2f\n", total));
    bw.flush();  
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

