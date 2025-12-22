import java.util.Scanner;

public class Main1038 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int codigo = leitor.nextInt();
        int quantidade = leitor.nextInt();

        switch(codigo){
            case 1: 
                System.out.printf("Total: R$ %.2f\n", 4.0 * quantidade);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", 4.50 * quantidade);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", 5.0 * quantidade);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", 2.0 * quantidade);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", 1.5 * quantidade);
                break;
        }

        leitor.close();
    }
}
