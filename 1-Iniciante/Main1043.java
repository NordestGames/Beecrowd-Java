import java.util.Locale;
import java.util.Scanner;

public class Main1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        float a = leitor.nextFloat();
        float b = leitor.nextFloat();
        float c = leitor.nextFloat();

        float perimetroTriangulo, areaTrapezio;
        
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            perimetroTriangulo = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetroTriangulo);
        } else {
            areaTrapezio = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }

        leitor.close();
    }    
}
