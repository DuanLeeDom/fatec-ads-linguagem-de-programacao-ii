import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linha = 3, coluna = 3;
        int[][] matriz = new int[linha][coluna];

        for (linha = 0; linha < 3; linha++){
            for (coluna = 0; coluna < 3; coluna++){
                System.out.print("[" + linha + "] ["+ coluna + "]" + " | Informe: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("------------------------");
        for (linha = 0; linha < 3; linha++){
            for (coluna = 0; coluna < 3; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}