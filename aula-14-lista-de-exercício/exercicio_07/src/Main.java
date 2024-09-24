import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        char op;

        do {
            int i = 0;
            int tamanhoArray = 5;
            String[] nome = new String[tamanhoArray];

            System.out.println("---[ BIBLIOTECA ]---");
            while (i < tamanhoArray) {
                System.out.print((i + 1) + "°) Informe o nome do livro: ");
                nome[i] = scanner.nextLine();
                i++;
            }

            System.out.println("\n---[ ESCOLHA SEU LIVRO AGORA! ]---");
            ListaLivros(nome[0], nome[1], nome[2], nome[3], nome[4]);
            System.out.print("Qual será o livro (1-5): ");
            int opcao = scanner.nextInt();

            // Chama o método para escolher o livro
            String livroEscolhido = EscolhaLivro(opcao, nome[0], nome[1], nome[2], nome[3], nome[4]);
            System.out.println("Você escolheu: " + livroEscolhido);

            System.out.print("Deseja repetir o processo (S/N)?: ");
            op = scanner.next().charAt(0);
            scanner.nextLine();

        } while (op == 'S' || op == 's');

        scanner.close();
    }

    public static void ListaLivros(String n1, String n2, String n3, String n4, String n5) {
        System.out.println("1°) Livro: " + n1 + "\n" +
                "2°) Livro: " + n2 + "\n" +
                "3°) Livro: " + n3 + "\n" +
                "4°) Livro: " + n4 + "\n" +
                "5°) Livro: " + n5);
    }

    public static String EscolhaLivro(int op, String n1, String n2, String n3, String n4, String n5) {
        String resultado;
        switch (op) {
            case 1:
                resultado = n1;
                break;
            case 2:
                resultado = n2;
                break;
            case 3:
                resultado = n3;
                break;
            case 4:
                resultado = n4;
                break;
            case 5:
                resultado = n5;
                break;
            default:
                resultado = "ERRO: a alternativa não foi válida!";
                break;
        }
        return resultado;
    }
}
