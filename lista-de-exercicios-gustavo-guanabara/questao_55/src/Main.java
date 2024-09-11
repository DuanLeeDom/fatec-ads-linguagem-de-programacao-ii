import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10);
        int contador = 1, n = 0;3

        System.out.println("---[ TENTE ADIVINHAR QUAL NÚMERO É (1-5) ]---");
        while (n != numeroSorteado && contador <= 4) {
            System.out.print("Informe " + contador + "º número: ");
            n = leia.nextInt();
            if (n == numeroSorteado) {
                System.out.println("Parabéns, você acertou o número sorteado!");
            } else {
                System.out.println("Não acertou!");
            }
            contador++;
        }
        System.out.println("Número Sorteado:" + numeroSorteado);
    }
}