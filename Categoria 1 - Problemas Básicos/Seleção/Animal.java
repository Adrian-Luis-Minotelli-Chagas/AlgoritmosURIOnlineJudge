import java.util.Scanner;
//import java.util.Locale;

public class Animal{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);

   
   String pal1 = ler.nextLine(); 
   String pal2 = ler.nextLine(); 
   String pal3 = ler.nextLine(); 
  
   if( pal1.equals("vertebrado") ){
   
      if(pal2.equals("ave")){
         if(pal3.equals("carnivoro")){
            System.out.printf("aguia\n");
         }else System.out.printf("pomba\n");
         
      }else if(pal3.equals("onivoro")){
         System.out.printf("homem\n");
      }else System.out.printf("vaca\n");
   
   }else if(pal2.equals("inseto")){
      if(pal3.equals("hematofago")){
         System.out.printf("pulga\n");
      }else System.out.printf("lagarta\n");
   
   }else if(pal3.equals("hematofago")){
      System.out.printf("sanguessuga\n");
   }else System.out.printf("minhoca\n");

   
   
   }
}