// Proposta de Programa
// Descrição: O programa deve criar uma matriz de números inteiros onde o usuário define o tamanho
// (NxN). Ele irá preencher a matriz com valores fornecidos pelo usuário. Em seguida, calculará a soma
// de todos os elementos da matriz e apresentará algumas estatísticas como o maior e o menor valor
// encontrado. Esse exercício integra a criação, manipulação e iteração sobre uma matriz.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de N para criar uma matriz NxN: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Preencha a matriz com valores inteiros: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0, maior = matriz[0][0], menor = matriz[0][0];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                soma += matriz[i][j];
                if (matriz[i][j] > maior) maior = matriz[i][j];
                if (matriz[i][j] < menor) menor = matriz[i][j];
            }
        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma de todos os elementos: " + soma);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}