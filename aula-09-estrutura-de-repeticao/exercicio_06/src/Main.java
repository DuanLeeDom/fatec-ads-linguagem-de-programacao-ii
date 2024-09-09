import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.print("Digite um número (0 para encerrar): ");
        numero = leia.nextInt();

        while (numero != 0){
            soma = soma + numero;
            System.out.print("Digite outro número (0 para encerrar): ");
            numero = leia.nextInt();
        }
        System.out.print("A SOMA DOS NÚMEROS: " + soma);
    }
}