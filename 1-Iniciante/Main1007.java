import java.util.Scanner;

public class Main1007{
    public static void main(String[] args){

        int A, B, C, D, DIFERENCA;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        DIFERENCA = (A * B - C * D);
        System.out.printf("DIFERENCA = %d\n", DIFERENCA);
    }
}