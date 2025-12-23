import java.util.Arrays;
import java.util.Scanner;

public class Main1042 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int num3 = leitor.nextInt();

        int[] array = {num1, num2, num3};
        Arrays.sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
        leitor.close();
    }
}
