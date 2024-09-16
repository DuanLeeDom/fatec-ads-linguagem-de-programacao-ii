import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoArray = 5;
        int [] numeros = new int[tamanhoArray];

        // Definindo o tamanho do array para 5 números inteiros
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibindo os no array
        System.out.println("\nNúmeros no array:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
    }
}