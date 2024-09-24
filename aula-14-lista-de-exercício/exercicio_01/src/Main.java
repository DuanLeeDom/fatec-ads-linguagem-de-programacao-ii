import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = 0,n2 = 0;

        System.out.print("Informe o 1° primeiro número: ");
        n1 = scanner.nextInt();

        System.out.print("Informe o 2° segundo número: ");
        n2 = scanner.nextInt();

        String resultado = validador(n1, n2);

        System.out.println("---[ Tela Final ]---\n" +
                "O 1° primeiro número é divisivel pelo 2° segundo número?: " + resultado);
    }

    public static String validador(int valor1, int valor2){
        String result = "";

        if (valor1%valor2 == 0) {
            result = "SIM";
        } else if (valor1%valor2 != 0) {
            result = "NÃO";
        }
        return result;
    }
}