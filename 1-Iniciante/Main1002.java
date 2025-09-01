import java.util.Locale;
import java.util.Scanner;

public class Main1002 {
    public static void main(String[] args) {
        
        double pi = 3.14159, area, raio;
        
        Scanner crs = new Scanner(System.in).useLocale(Locale.US);
        raio = crs.nextDouble();
        area = pi * (raio*raio);

        System.out.printf("A=%.4f\n", area);
    }
}
 