import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class NumeracaoRomanaParaNumerosDePaginas{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    String n = br.readLine();
    int tam = n.length();
    int num = Integer.parseInt(n);
    int aux = 0;
    int c = num/100;
    int d = (num%100)/10;
    int u = (num%100)%10;
    String saida = "";
    
    switch(tam){
      case 3: while(aux != c){
                  saida +="C";
                  aux++;
                  if(aux == 4) saida = "CD";
                  if(aux == 5) saida = "D";
                  if(aux == 9) saida = "CM";
               }
               bw.write(saida);
               aux = 0;
               saida = ""; 

      case 2: while(aux != d){
                  saida +="X";
                  aux++;
                  if(aux == 4) saida = "XL";
                  if(aux == 5) saida = "L";
                  if(aux == 9) saida = "XC";
               }
               bw.write(saida);
               aux = 0;
               saida = ""; 

      case 1:  while(aux != u){
                  saida +="I";
                  aux++;
                  if(aux == 4) saida = "IV";
                  if(aux == 5) saida = "V";
                  if(aux == 9) saida = "IX";
               }
               bw.write(saida);
               aux = 0;
               saida = "";
         break;
    
    }
    bw.newLine();
    bw.flush();  
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

