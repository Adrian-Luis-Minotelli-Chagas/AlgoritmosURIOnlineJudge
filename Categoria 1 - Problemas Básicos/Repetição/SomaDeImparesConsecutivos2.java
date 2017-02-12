import java.util.Scanner;
//import java.util.Locale;
 
public class SomaDeImparesConsecutivos2{
  
    public static void main(String[] args){
  
    //Locale.setDefault(Locale.US);
       
    Scanner ler = new Scanner(System.in);
    
    int n = ler.nextInt();
    int num = 0;
    int num2 = 0;
    int soma = 0;
    
    for(;n > 0;n--){
      
      num = ler.nextInt();
      num2 = ler.nextInt();
      
      if(num > num2){

         for(num2+=1;num2 < num; num2++){
            if( num2%2 != 0) soma +=num2;
         } 
      }else{
         for(num+=1;num < num2; num++){
            if( num%2 != 0) soma +=num;
         }
       }
   
    System.out.printf("%d\n",soma);
    soma = 0;
    }
     
    
  
    }
  
}