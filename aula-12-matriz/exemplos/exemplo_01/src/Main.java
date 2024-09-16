import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nome da estrutura é valores.
        int[][] valores = new int[3][4];
        int valor = 0;

        for (int linha = 0; linha < 3; linha ++) {
            for (int colunas = 0; colunas < 4; colunas++){
                valores[linha][colunas] = valor;
                valor++;
            }
        }
    }
}