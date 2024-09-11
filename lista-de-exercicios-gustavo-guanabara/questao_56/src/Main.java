import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100);
        int contador = 1, n, soma = 0;
        boolean validacao = false;

        System.out.println("O programa será interrompido quando o número 1111 for digitado: ");
        while (validacao == false){
            System.out.print("Informe o número: ");
            n = leia.nextInt();
            if (n == 1111){
                validacao = true;
            } else {
                soma = soma + n;
            }
        }
        System.out.println("Os números somados são: " + soma);
    }
}