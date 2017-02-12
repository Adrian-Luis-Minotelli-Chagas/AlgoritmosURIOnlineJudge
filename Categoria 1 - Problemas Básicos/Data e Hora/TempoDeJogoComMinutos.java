import java.util.Scanner;
//import java.util.Locale;

public class TempoDeJogoComMinutos{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   int h1 = ler.nextInt(); 
   int m1 = ler.nextInt(); 
   int h2 = ler.nextInt();
   int m2= ler.nextInt();
   
   if(h1 == h2 && m1 == m2 && h1 == m1){
      System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24,0);
       
   }else if(h1 == h2 && m1 > m2 ){
      System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",23,60-m1+m2);  
   
   }else if (h1 == h2 && m2 < m1){
      System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",0,60+m2-m1);  
   
   }else if( h1 > h2){
   
      if(m1 > m2){
         System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24-h1+h2-1,60-m1+m2);
      }else System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24-h1+h2-1,60-m2+m1);
        
   }else if(m1 > m2){
         System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",h2-h1-1,60-m1+m2);
      }else System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",h2-h1,m2-m1); 
   
    

   
   
   }
}