import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] vetor = new int[20];
        int temp = 0;

        for (int i = 0; i < 20; i++){
            vetor[i] = random.nextInt(100);
        }

        System.out.println("Números escolhidos no vetor: ");
        for (int i = 0; i < 20; i++){
            System.out.println((i + 1) + "° Vetor: " + vetor[i]);
        }

        System.out.println("-------------------");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                if (vetor[j] > vetor[j + 1]){
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < 20; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}