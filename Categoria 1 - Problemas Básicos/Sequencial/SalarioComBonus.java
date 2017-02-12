import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class SalarioComBonus {
 
    public static void main(String[] args) throws IOException {
 
    Locale.setDefault(Locale.US);
    Scanner leitor = new Scanner(System.in);
    String nome = leitor.nextLine();
    double sal = leitor.nextDouble();
    double ven = leitor.nextDouble();

    System.out.printf ("TOTAL = R$ %.2f\n", (ven*0.15) + sal);
 
    }
 
}