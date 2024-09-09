import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(15);

        System.out.println("---[ TENTE ADIVINHAR QUAL NÚMERO É (1-5) ]---");
        System.out.print("Informe um número: ");
        int n = leia.nextInt();

        if (n == numeroSorteado){
            System.out.println("Parabéns, você acertou o número sorteado! \n" +
                    "Número Sorteado: " + numeroSorteado);
        } else {
            System.out.println("Que pena, você não acertou o número sorteado! \n" +
                    "Número Sorteado: " + numeroSorteado);
        }
    }
}