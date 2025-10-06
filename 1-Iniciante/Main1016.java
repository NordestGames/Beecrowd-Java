import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int distancia = leitor.nextInt();
        int tempo = distancia * 60 / 30;

        System.out.printf("%d minutos\n", tempo);

        leitor.close();
    }
}
