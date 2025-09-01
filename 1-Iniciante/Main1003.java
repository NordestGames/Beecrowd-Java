import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args){

        int A, B, SOMA;
        
        Scanner scanner = new Scanner(System.in);
        
        A = scanner.nextInt();
        B = scanner.nextInt();
        SOMA = A+B;
        
        System.out.printf("SOMA = %d\n", SOMA);
        scanner.close();
    }
}