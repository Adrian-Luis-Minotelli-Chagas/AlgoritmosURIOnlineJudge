import java.util.Scanner;

class Life_Universe_Everything{
   public static void main(String args[]){
      
      Scanner scanner = new Scanner(System.in);
      
      int[] input = new int[100];
      int i = 0;
      int num = 0;
      do{
         num = scanner.nextInt();
         input[i] = num;
         ++i;
      }while(num != 42);
      
      for(int k = 0; k < i; k++){

            System.out.println(input[k]);         
      }
   }
}