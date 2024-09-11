import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 0;
        float n, soma = 0;
        char op;

        do {
            contador++;
            System.out.print("Informe " + contador + "º número: ");
            n = leia.nextFloat();
            soma += n;
            System.out.print("Deseja continuar? (S/N): ");
            op = leia.next().charAt(0);
        } while(op == 'S' || op == 's');
        if (op == 'N' || op == 'n'){
            System.out.println("---[ TELA FINAL ]--- \n" +
                    "Total de números: " + contador + "\n" +
                    "A soma total: " + soma);
        }
    }
}