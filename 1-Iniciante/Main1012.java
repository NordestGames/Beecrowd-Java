import java.util.Locale;
import java.util.Scanner;

public class Main1012 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        double pi = 3.14159;
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();

        double areaTriangulo = (a * c)/2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c)/2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado );
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        leitor.close();
    }
}
