import java.util.Scanner;

public class Main1019{
    public static void main(String[] args){

        int horas, min, sec, totalSecs;
        Scanner csr = new Scanner(System.in);

        totalSecs = csr.nextInt();

        horas = (totalSecs / 3600 );
        min = (totalSecs % 3600) / 60;
        sec = (totalSecs % 60);

        System.out.printf("%d:%d:%d\n", horas, min, sec);

        csr.close();
    }
}