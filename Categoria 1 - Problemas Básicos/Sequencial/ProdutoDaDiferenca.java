import java.util.Scanner;

public class ProdutoDaDiferenca{
   public static void main(String[] args){
   
   Scanner ler = new Scanner(System.in);
       
   System.out.printf("DIFERENCA = %d\n", 
   ( ler.nextInt()*ler.nextInt() ) - ( ler.nextInt()*ler.nextInt())  );
   
   }
}