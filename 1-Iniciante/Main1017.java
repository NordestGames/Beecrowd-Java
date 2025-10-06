import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int kmPorLitro = 12;
        int tempo = leitor.nextInt();
        int velocidade = leitor.nextInt();

        double distanciaPercorrida = velocidade * tempo;
        double qtdLitros = distanciaPercorrida / kmPorLitro;

        System.out.printf("%.3f\n", qtdLitros);

        leitor.close();
    }
}
