import java.util.Scanner;

public class Main1037 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float num = leitor.nextFloat();

        if(num >= 0 && num <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if(num > 25.00001 && num <= 50) {
            System.out.println("Intervalo (25,50]");
        }else if(num > 50.00001 && num <= 75) {
            System.out.println("Intervalo (50,75]");
        }else if(num > 75.00001 & num <= 100) {
            System.out.println("Intervalo (75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }

        leitor.close();
    }
}
