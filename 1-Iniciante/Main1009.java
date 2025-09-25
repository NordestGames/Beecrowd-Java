import java.util.Locale;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) {
        String nome;
        double salarioFixo;
        double totalDeVendas;
        double totalReceber;
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        nome = leitor.nextLine();
        salarioFixo = leitor.nextDouble();
        totalDeVendas = leitor.nextDouble();
        
        totalReceber = salarioFixo + (totalDeVendas * 0.15);  

        System.out.printf("TOTAL = R$ %.2f\n",totalReceber);

        leitor.close();
    }
}