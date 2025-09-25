import java.util.Scanner;
import java.util.Locale;
public class Main1010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        int codPeca1 = leitor.nextInt();
        int qntPeca1 = leitor.nextInt();
        double valorPeca1 = leitor.nextDouble();

        int codPeca2 = leitor.nextInt();
        int qntPeca2 = leitor.nextInt();
        double valorPeca2 = leitor.nextDouble();

        double valorTotal = (valorPeca1 * qntPeca1) + (valorPeca2 * qntPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        leitor.close();
    }
}