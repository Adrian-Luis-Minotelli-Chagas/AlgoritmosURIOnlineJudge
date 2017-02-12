import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class Grenais{
  
    public static void main(String[] args) throws IOException {
  
    Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
     
    int grenais = 0;
    int inter = 0;
    int gremio = 0;
    int empates = 0;
    int novojogo = 1;
    int i=0,g=0;
    
    while(novojogo == 1){
      grenais++;
      i = ler.nextInt();
      g = ler.nextInt();
      
      if( i > g){
         inter++;
      
      }else if( g > i){
         gremio++;
      
      }else empates++;
      
      do{
         System.out.printf("Novo grenal (1-sim 2-nao)\n");
         novojogo = ler.nextInt();
      }while(novojogo < 1 && novojogo > 2);
    
    }
    
    System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n",grenais,inter,gremio,empates);
    
    if(inter > gremio){
      System.out.printf("Inter venceu mais\n");
    
    }else if (gremio > inter){
      System.out.printf("Gremio venceu mais\n");
    
    }else System.out.printf("Nao houve vencedor\n");
    
    
  
    }
  
}