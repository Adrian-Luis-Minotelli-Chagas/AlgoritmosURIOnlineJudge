import java.io.IOException;
import java.util.Locale;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Experiencias{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));          
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
    int n = Integer.parseInt(br.readLine());
    int s = 0;
    int c = 0;
    int r = 0;
    
    String[] caso;
   
    for(int i = 0; i < n ; i++){   

         caso = br.readLine().split(" ");
         
         switch(caso[1]){
              
             case "S": s += Integer.parseInt( caso[0] );
                break;
              
             case "C": c += Integer.parseInt( caso[0] );
                break;
                 
             case "R": r += Integer.parseInt( caso[0] );
                break;
          } 
         
    }            
    int total = c+s+r;
    bw.write(String.format("Total: %d cobaias\n",total));
    bw.write(String.format("Total de coelhos: %d\n",c));
    bw.write(String.format("Total de ratos: %d\n",r));
    bw.write(String.format("Total de sapos: %d\n",s));    
    bw.write(String.format("Percentual de coelhos: %.2f %%\n",(float)(c*100)/total));
    bw.write(String.format("Percentual de ratos: %.2f %%\n",(float)(r*100)/total));
    bw.write(String.format("Percentual de sapos: %.2f %%\n",(float)(s*100)/total));
    bw.flush();        
    }
  
}