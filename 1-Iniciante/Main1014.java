import java.util.Scanner;
import java.util.Locale;

public class Main1014 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        int x = leitor.nextInt();
        float y = leitor.nextFloat();
        float media = x / y;
        System.out.printf("%.3f km/l\n", media);

        leitor.close();
    }
}
