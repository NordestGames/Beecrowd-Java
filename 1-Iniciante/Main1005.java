import java.util.Locale;
import java.util.Scanner;

public class Main1005{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        double a, b, media;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        media = ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}