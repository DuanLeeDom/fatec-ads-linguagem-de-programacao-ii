import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = 0;

        System.out.print("Informe um número: ");
        n = leia.nextInt();

        if (n%3==0) {
            System.out.println("Divisivel por 3.");
        } else {
            System.out.println("Não é divisivel por 3.");
        }
    }
}