import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.print("Informe um número: ");
        numero = scanner.nextInt();

        tabuada(numero);
    }

    public static void tabuada(int n1){
        if (n1 <= 0) {
            System.out.println("Não é aceito um número menor ou igual a zero");
        } else {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " x " + n1 + " = " + n1*i);
            }
        }
    }
}