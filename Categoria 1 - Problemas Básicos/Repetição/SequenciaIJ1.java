import java.io.IOException;
//import java.util.Scanner;
//import java.util.Locale;
 
public class SequenciaIJ1{
  
    public static void main(String[] args) throws IOException {
  
    //Locale.setDefault(Locale.US);
       
    //Scanner ler = new Scanner(System.in);

     
    int i = 1;
    
    for(int j = 60; j > -1; j-=5){
      System.out.printf("I=%d J=%d\n",i,j);
      i+=3;
    }
   
  
    }
  
}