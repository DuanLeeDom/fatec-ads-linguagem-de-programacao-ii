import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int somaidade = 0;

        for (int i = 1; i <= 5; i += 1) {
            System.out.print("Informe " + i + "º idade: ");
            int idade = leia.nextInt();
            somaidade = somaidade + idade;
        }
        float media = somaidade/5;

        System.out.println("---[ TELA FINAL ]--- \n" +
                "Média das idade: " + media);
    }
}