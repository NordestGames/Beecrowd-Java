import java.util.Scanner;

public class Main1020 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int ano, mes, dias;
        int idadeDias = leitor.nextInt();

        ano = idadeDias / 365;
        mes = (idadeDias % 365) / 30;
        dias = (idadeDias % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    
        leitor.close();
    }
}
