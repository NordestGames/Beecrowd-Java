import java.util.Locale;
import java.util.Scanner;

public class Main1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        double raiz = (b * b - 4 * a * c);

        if(a != 0 && raiz > 0) {
            double r1 = (-b + Math.sqrt(raiz)) / (2 * a);
            double r2 = (- b - Math.sqrt(raiz)) / (2 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        } else {
            System.out.println("Impossivel calcular");
        }

        leitor.close();
    }
}
