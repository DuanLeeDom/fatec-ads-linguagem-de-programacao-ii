import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a primeira letra: ");
        String a = leia.nextLine();

        System.out.print("Informe a segunda letra: ");
        String b = leia.nextLine();

        System.out.println("Primeira letra " + a);
        System.out.println("Segunda letra " + b);

        String aux = a;
        a = b;
        b = aux;

        System.out.println("Primeira letra: " + a);
        System.out.println("Segunda letra: " + b);
    }
}