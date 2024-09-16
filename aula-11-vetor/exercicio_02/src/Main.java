import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        float soma = 0;
        int tamanhoArray = 30;
        float[] numeros = new float[tamanhoArray];

        for (int i = 0; i < 30; i++){
            System.out.println("Informe o número " + i + ": ");
            numeros[i] = random.nextFloat(100);
            soma += numeros[i];
        }
        float media = soma/30;

        System.out.println("---[ TELA FINAL ]---");
        System.out.println("Os arrays são: ");
        for (int i = 0; i < 30; i++){
            System.out.println("O vetor " + i + " é: " + numeros[i]);
        }
        System.out.println("A média deles são: " + media);
    }
}