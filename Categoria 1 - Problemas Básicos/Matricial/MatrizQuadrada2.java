import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class MatrizQuadrada2{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int tam = Integer.parseInt(br.readLine());
    int matriz[][] = new int[100][100];   
    int cont;
    int ini;
    int fim;
         
    while(tam > 0){
      for (int i = 0; i < tam; i++){
            for (int j = 0; j < tam; j++){
               if (i == 0){
                  matriz[i][j] = j+1;
               } else {
                  if (j == 0){
                     matriz[i][j] = i+1;
                  } else {
                     matriz[i][j] = matriz[i-1][j-1];
                  }
               }
            }
         }
         
      int f = tam - 1;
      
      for(int i = 0; i < tam; i++){
         for(int k = 0; k < f; k++)
               bw.write(String.format("%3d ", matriz[i][k]));
         bw.write(String.format("%3d", matriz[i][f]));
         bw.newLine();
      }
      bw.newLine();
      bw.flush();    
      tam = Integer.parseInt(br.readLine());
    }
    
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.flush();

    }//FIM METODO MAIN
  
}//FIM DA CLASSE