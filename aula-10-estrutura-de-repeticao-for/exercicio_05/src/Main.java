import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = leia.nextInt();

        for (int i = 0; i <= 10; i += 1) {
            System.out.println(i + " x " + n + " = " + i*n);
        }
    }
}