import java.util.Scanner;
import java.util.Locale;

public class Main1011{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        double r = leitor.nextDouble();
        double pi = 3.14159;
        double volume = (4/3.0) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        leitor.close();
    }
}