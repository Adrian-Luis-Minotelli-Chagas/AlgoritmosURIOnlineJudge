import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class OEscolhido{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    String matricula = "";
    double maior = 0.0;
    String[] aluno;
    for(int i = 0; i < n; i++){
       
       aluno = br.readLine().split(" ");
       
       if(Double.parseDouble(aluno[1]) > maior){
         maior = Double.parseDouble(aluno[1]);
         matricula = aluno[0];
       }
    }
    
    if( maior > 7.9){
      bw.write(matricula+"\n");
    }else bw.write("Minimum note not reached\n");
           
    bw.flush();
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

