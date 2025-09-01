import java.util.Locale;
import java.util.Scanner;

public class Main1008{
    public static void main (String[] args){
        
        int number, horasTrabalho;
        double valorHora, salario;
        Scanner scr = new Scanner(System.in).useLocale(Locale.US);
        
        number = scr.nextInt();
        horasTrabalho = scr.nextInt();
        valorHora = scr.nextDouble();
        salario = (horasTrabalho * valorHora);

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number, salario);

        scr.close();
    }
}