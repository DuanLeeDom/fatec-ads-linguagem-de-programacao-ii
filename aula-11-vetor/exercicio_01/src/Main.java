import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar os produtos
        String[] produtos = new String[10];

        // Loop com for para ler os produtos
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextLine(); // Para a leitura de array
        }

        // Exibe os produtos na tela
        System.out.println("\nProdutos cadastrados:");
        for (int i = 0; i < produtos.length; i++){
            System.out.println("Produto " + (i + 1) + ": " + produtos[i]); // Para mostrar o array
        }

        // Fecha o scanner
        scanner.close();
    }
}