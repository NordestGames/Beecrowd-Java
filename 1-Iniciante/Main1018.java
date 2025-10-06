import java.util.Scanner;

public class Main1018 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int nota = leitor.nextInt();
        int qntDeNotas;
        int[] dividirNotas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(nota);

        for(int valorDaNota : dividirNotas){
            qntDeNotas = nota / valorDaNota;
            nota %= valorDaNota;
            System.out.printf("%d nota(s) de R$ %d,00\n", qntDeNotas, valorDaNota);
        }

        leitor.close();
    }
}
