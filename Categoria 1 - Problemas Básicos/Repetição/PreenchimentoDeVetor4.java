import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.util.Locale;
 
public class PreenchimentoDeVetor4{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
  
    Integer[] impar = new Integer[5];
    Integer[] par = new Integer[5];
    
    int p = 0;
    int i = 0; 
    int num = 0;
    
    for(int r = 0; r < 15; r++){
      num = Integer.parseInt(br.readLine());
      
      if(num%2 == 0){
         par[p] = num;
         p++;
      
      }else{
         impar[i] = num;
         i++;
      }
      
      if(p == 5){
         p = 0;
         for(Integer k = 0; k < 5; k++){
            bw.write("par["+k.toString()+"] = "+par[k].toString()+"\n"); 
            bw.flush();
         }
      
      }else if(i == 5){
         i = 0;
         for(Integer k = 0; k < 5; k++){
            bw.write("impar["+k.toString()+"] = "+impar[k].toString()+"\n"); 
            bw.flush();
         }
      
      }
      
    }
    
    if( i != 0){
      for(Integer k = 0; k < i; k++){
            bw.write("impar["+k.toString()+"] = "+impar[k].toString()+"\n"); 
            bw.flush();
         }
    }   
   
    if( p != 0){
      for(Integer k = 0; k < p; k++){
            bw.write("par["+k.toString()+"] = "+par[k].toString()+"\n"); 
            bw.flush();
         }
    }        
  
    }//FIM METODO MAIN
  
}//FIM DA CLASSE