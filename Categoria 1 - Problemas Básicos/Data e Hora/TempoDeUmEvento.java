import java.util.Scanner;
//import java.util.Locale;

public class TempoDeUmEvento{
   public static void main(String[] args){
      
   //Locale.setDefault(Locale.US);
      
   Scanner ler = new Scanner(System.in);
   
   String dia1 = "";
   String hms1 = "";
   String dia2 = "";
   String hms2 = "";
   
   int secIniciaTotal = 0;
   int secFinalTotal = 0;
   
   dia1 = ler.nextLine();
   
   hms1 = ler.nextLine();
   
   dia2 = ler.nextLine();
   
   hms2 = ler.nextLine();
   
   if(dia1.length() == 5){
      dia1 = dia1.substring(4,5);
   
   }else dia1 = dia1.substring(4,6);
   
   if(dia2.length() == 5){
      dia2 = dia2.substring(4,5);
   
   }else dia2 = dia2.substring(4,6);
   
   secIniciaTotal = (Integer.parseInt( dia1 )*86400)+
                    (Integer.parseInt( hms1.substring(0,2) )*3600) +
                    (Integer.parseInt( hms1.substring(5,7) )*60) +
                    Integer.parseInt( hms1.substring(10,12) );
                    
   secFinalTotal = (Integer.parseInt( dia2 )*86400)+
                   (Integer.parseInt( hms2.substring(0,2) )*3600) +
                   (Integer.parseInt( hms2.substring(5,7) )*60) +
                   Integer.parseInt( hms2.substring(10,12) );
   
   
   secFinalTotal -= secIniciaTotal;
   
   int aux = secFinalTotal/86400;
   secFinalTotal -= (aux*86400);
   
   System.out.printf("%d dia(s)\n",aux);
   
   aux = secFinalTotal/3600;
   secFinalTotal -= (aux*3600);
   
   System.out.printf("%d hora(s)\n",aux);
   
   aux = secFinalTotal/60;
   secFinalTotal -= (aux*60);
   
   System.out.printf("%d minuto(s)\n",aux);
   
   System.out.printf("%d segundo(s)\n",secFinalTotal);
   
   }
}