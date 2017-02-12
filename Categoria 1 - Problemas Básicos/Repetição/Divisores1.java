import java.io.IOException;
//import java.util.Scanner;
import java.io.*;
import java.util.Locale;
 
public class Divisores1{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
   
    int n =  Integer.parseInt(br.readLine());
    
    for(Integer i = 1; i <= n; i++)
      if(n%i == 0)bw.write(i.toString()+"\n");
                           
    bw.flush();
    

    }//FIM DA MAIN
  
}//FIM CLASS