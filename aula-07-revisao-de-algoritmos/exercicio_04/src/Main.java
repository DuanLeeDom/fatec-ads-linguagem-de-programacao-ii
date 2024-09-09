import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int ano_nascimento, idade, ano_atual;
        String resultado = "";

        System.out.print("Informe o seu ano de nascimento: ");
        ano_nascimento = leia.nextInt();

        ano_atual = 2024;

        idade = 2024 - ano_nascimento;

        if (idade > 18) {
            resultado = "vai poder";
        } else if (idade < 18) {
            resultado = "não vai poder";
        }

        System.out.println("Você " + resultado + " votar esse ano");
    }
}