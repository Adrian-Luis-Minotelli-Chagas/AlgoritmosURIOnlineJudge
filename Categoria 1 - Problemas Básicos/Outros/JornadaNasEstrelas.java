import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class JornadaNasEstrelas{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());
    
    int[] totalCarneiros = new int[n];
    long carneirosRoubados = 0;
    int i =0;
    int[] estrelasRoubadas = new int[n];
    int contagemDeEstrelas = 0;
    
    String[] aux = br.readLine().split(" ");
    
    for(i = 0; i < n; i++){
      totalCarneiros[i] = Integer.parseInt(aux[i]) ;
      carneirosRoubados +=(long)totalCarneiros[i];
      estrelasRoubadas[i] = 0;
    }
    
    i = 0;
    n--;
    while( !(i < 0 || i > n) ){
      
      if(totalCarneiros[i] > 0){
         carneirosRoubados--;
         estrelasRoubadas[i] = 1;       
      }
      if(totalCarneiros[i]%2 == 0){
            totalCarneiros[i] -=1;
            i--;
         }else{
            totalCarneiros[i] -=1;
            i++; 
         }
    }
    n++;
    for(int y=0; y < n; y++){
    
      if(estrelasRoubadas[y] == 1){ 
         contagemDeEstrelas++;
      }
    }
    bw.write(contagemDeEstrelas+" "+carneirosRoubados+"\n");

   
    bw.flush();
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

