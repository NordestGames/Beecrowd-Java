import java.util.Scanner;

public class Main1004{
    public static void main(String[] args) {
        int n1, n2, prod;
        Scanner scanner = new Scanner(System.in);
        
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        prod = (n1 * n2);    
        System.out.printf("PROD = %d\n", prod);
        
        scanner.close();
    }
}