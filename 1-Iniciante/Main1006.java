import java.util.Locale;
import java.util.Scanner;

public class Main1006{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a, b, c, media;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.printf("MEDIA = %.1f\n", media);

        scanner.close();
    }

}