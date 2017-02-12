import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class CrescimentoPopulacional{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);
  
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int t =  ler.nextInt();
    
    int pa = 0;
    int pb = 0;
    int cont = 0;
    double g1 = 0.0;
    double g2 = 0.0;
    
    
    for(int i = 0; i < t; i++){
    
      pa =  ler.nextInt();
      pb =  ler.nextInt();
      g1 =  ler.nextDouble()/100;
      g2 =  ler.nextDouble()/100;
      
      while(pa <= pb){
         pa +=(int)pa*g1;
         pb +=(int)pb*g2;
         cont++;
         if(cont > 100) break;
      }
      
      if(cont > 100){
         System.out.printf("Mais de 1 seculo.\n");   
      }else System.out.printf("%d anos.\n",cont);
            
      cont = 0;
    }
    
    //Integer.parseInt(br.readLine());
       
    //bw.write(i.toString()+"\n");
                            
    //bw.flush();
  
    }
  
}