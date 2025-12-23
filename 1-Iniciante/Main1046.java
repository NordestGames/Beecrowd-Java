import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int horaInicial = leitor.nextInt();
        int horaFinal = leitor.nextInt();
        int tempoTotal;

        if(horaInicial < horaFinal) {
            tempoTotal = horaFinal - horaInicial;
        } else {
            tempoTotal = (24 - horaInicial) + horaFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", tempoTotal);

        leitor.close();
    }
}
