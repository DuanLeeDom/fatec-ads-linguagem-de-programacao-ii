import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importar biblioteca Scanner
        Scanner leia = new Scanner(System.in);

        // Variavel
        String nome, matricula, turma;

        // Comando de saida | Usando sout + tab = Mostra o que tá em baixo
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua matricula: ");
        matricula = leia.nextLine();

        System.out.println("Digite sua turma: ");
        turma = leia.nextLine();

        System.out.println(nome + " sua matricula é " + matricula + " e sua turma é: " + turma);
    }
}