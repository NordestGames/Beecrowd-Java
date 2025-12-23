import java.util.Scanner;

public class Main1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra1 = input.nextLine();
        if(palavra1.equals("vertebrado")) {
            String palavra2 = input.nextLine();
            if(palavra2.equals("ave")){
                String palavra3 = input.nextLine();
                if(palavra3.equals("carnivoro")){
                    System.out.println("aguia");
                } else if(palavra3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }
            if (palavra2.equals("mamifero")) {
                String palavra3 = input.nextLine();
                if(palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }
        else if(palavra1.equals("invertebrado")) {
            String palavra2 = input.nextLine();
            if(palavra2.equals("inseto")) {
                String palavra3 = input.nextLine();
                if(palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if(palavra3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            }
            if (palavra2.equals("anelideo")) {
                String palavra3 = input.nextLine();
                if(palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if(palavra3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
        
        input.close();
    }
}
