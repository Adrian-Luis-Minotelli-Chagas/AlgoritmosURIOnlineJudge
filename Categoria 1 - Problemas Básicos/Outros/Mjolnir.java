import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
  
    public static void main(String[] args) throws IOException {
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    int n = Integer.parseInt(br.readLine());
     
    String[] personagem;
     
    for(; n > 0; n--){
      personagem = br.readLine().split(" ");
       
      if(personagem[0].equals("Thor")){
         bw.write("Y\n");
      }else bw.write("N\n");
    }   
    bw.flush();
  
    }
  
}

