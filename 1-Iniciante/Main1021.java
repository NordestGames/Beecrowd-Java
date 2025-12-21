import java.util.Locale;
import java.util.Scanner;

public class Main1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double valorInformado = leitor.nextDouble();
        int valor = (int) Math.round(valorInformado * 100);
        
        
        int dividirNotas[] = {10000, 5000, 2000, 1000, 500, 200};
        int dividirMoedas[] = {100, 50, 25, 10, 5, 1};
        
        System.out.println("NOTAS:");
        for (int nota : dividirNotas) {
            int qtdNota = valor / nota;
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, nota / 100.0);        
        }

        System.out.println("MOEDAS:");
        for (int moedas : dividirMoedas) {
            int qtdMoeda = valor / moedas;
            valor %= moedas;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moedas / 100.0);
        }

        leitor.close();
    }
}
