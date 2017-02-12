import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Locale;
import java.util.Scanner;
 
public class MapaDoMeistre{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
    //Scanner ler = new Scanner(System.in);
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int largura = Integer.parseInt(br.readLine());
    int altura = Integer.parseInt(br.readLine());
    
    String[] mapaEmPedacos;
    String[][] mapaCompleto = new String[altura][largura];
    
    int[][] caminhosPecorridos = new int[2][altura*largura];
    int posRegCaminPercorido = 0;
    
    int xAtual = 0;
    int yAtual = 0;
    
    int xMaximoDir = largura-1;
    int xMaximoEsq = 0;
    
    int yMaximoAcima = 0;
    int yMaximoAbaixo = altura-1;
    
    String direcao = "";
    String validacao = "!";
    
    boolean controle = false;
    
    for(int k = 0; k < altura; k++){
      mapaEmPedacos = br.readLine().split("");
      for(int i = 0; i < largura; i++){
      mapaCompleto[k][i] = mapaEmPedacos[i];
      }//fimlargura
    }//fim altura
      
    if( !(mapaCompleto[0][0].equals(".")) ){
      while(true){        
         
         if(xAtual < xMaximoEsq || xAtual > xMaximoDir ) break;
         if(yAtual < yMaximoAcima || yAtual > yMaximoAbaixo ) break;
         
         if(mapaCompleto[yAtual][xAtual].equals("*")){
            validacao = "*";
            break;
         
         }else if(mapaCompleto[yAtual][xAtual].equals(".")){
            switch(direcao){
            case ">":  xAtual+=1;
            
               break;
               
            case "<":  xAtual-=1; 
            
               break;
               
            case "^": yAtual-=1;
               break;
               
            case "v": yAtual+=1;
               break;
            }
         
         }else{
            
            for(int c = 0; c < posRegCaminPercorido; c++){
               if(xAtual == caminhosPecorridos[0][c] && yAtual == caminhosPecorridos[1][c])
               controle = true; 
            }
            
            if(controle) break;
            
            caminhosPecorridos[0][posRegCaminPercorido] = xAtual;
            caminhosPecorridos[1][posRegCaminPercorido] = yAtual;
            posRegCaminPercorido++;
            
            switch(mapaCompleto[yAtual][xAtual]){
               case ">": direcao = ">"; 
                         xAtual+=1;
                  break;
               
              case "<": direcao = "<";  
                        xAtual-=1;
                  break;
               
              case "^": direcao = "^";
                        yAtual-=1;
                  break;
               
              case "v": direcao = "v";
                        yAtual+=1;
                  break;
            }
        
        }
         
      }//fim do loop de busca pelo mapa 
    }//fim da busca pelo mapa
          
    bw.write(validacao+"\n");
    bw.flush();
      
    //bw.write(String.format("%3d", matriz[i][f]));
    //Integer.parseInt(br.readLine());
    //bw.write("Menor valor: "+menor.toString()+"\n"+"Posicao: "+pos.toString()+"\n"); 
    //bw.newLine();
    //bw.flush();
   
    }//FIM METODO MAIN
  
}//FIM DA CLASSE

