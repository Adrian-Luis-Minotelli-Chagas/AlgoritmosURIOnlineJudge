import java.util.Scanner;

class Prime_Generator{
   public static void main(String args[]){
      
      Scanner scanner = new Scanner(System.in);
      Scanner scannerStr = new Scanner(System.in);
      
      int test = 0;
      int begin = 0;
      int end = 0;
      String numbers="";
      
      do{
      test = scanner.nextInt();
      }while(test < 0 || test > 9);
      
      for(int i=0; i < test;i++){
         numbers += scannerStr.nextLine();
         numbers += " ";
      }
      
      int all = test*2;
      String[] prime = new String[all];
      prime = numbers.split(" ");
      all = all-1;
      
      for(int i=0; i <= all ;){
            
            i += 2;        
      }
      
      
   }
}