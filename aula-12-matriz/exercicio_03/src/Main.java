import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o NxN: ");
        int n1 = scanner.nextInt();

        double exp = Math.pow(n1, 2);
        int[][] numero = new int[n1][n1];

        int soma = 1;

        // Determina o comprimento máximo dos números na matriz
        int maxLength = String.valueOf(n1 * n1).length();

        System.out.println("A exponenciação é: " + exp);

        // Preenche a matriz e imprime com formatação
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                // Formata a saída para garantir o alinhamento correto
                System.out.printf("[ %" + maxLength + "d ]", soma);
                soma += 1;
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }
    }
}