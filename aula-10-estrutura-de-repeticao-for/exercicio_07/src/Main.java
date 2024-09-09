import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = 0, pares = 0, impares = 0;

        for (int i = 1; i <= 10; i += 1){
            System.out.print("Informe o " + i + "º número: ");
            n = leia.nextInt();
            if (i%2 == 0){
                pares = pares + 1;
            }
            if (i%2 != 0) {
                impares = impares + 1;
            }
        }
        System.out.println("---[ TELA FINAL ]--- \n" +
                "Quantidade de Números Pares: " + pares + "\n" +
                "Quantidade de números Ímpares: " + impares);
    }
}