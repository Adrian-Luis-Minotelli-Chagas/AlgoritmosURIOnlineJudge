import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class FibonacciEmVetor{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    long[] v = new long[61];
    v[0] = 0;
    v[1] = 1;
    v[2] = 1;
    v[3] = 2;
     
    int t = Integer.parseInt(br.readLine());
    Integer[] lista = new Integer[t];
    int maior = 0;
     
    for(int i = 0; i < t;i++){
      lista[i] = Integer.parseInt(br.readLine());
      if(lista[i] > maior) maior = lista[i];
    }
    maior++;
    for(int k = 4; k < maior;k++){
      v[k] = v[k-1] + v[k-2]; 
    } 
      
      
    for(int j = 0; j < t;j++){
      bw.write("Fib("+lista[j].toString()+") = "+v[(lista[j])]+"\n");   
    }
    bw.flush();  
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE