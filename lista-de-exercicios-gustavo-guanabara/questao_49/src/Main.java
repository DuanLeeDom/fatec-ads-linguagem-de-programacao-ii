import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 1;
        int impares = 0, pares = 0;

        while (contador <= 6){
            System.out.print("Informe o " + contador + "º número: ");
            int numero = leia.nextInt();

            if (numero%2 == 0){
                pares = pares + 1;
            } else if (numero%2 != 0) {
                impares = impares + 1;
            }
            contador = contador + 1;
        }
        System.out.println("\n" +
                "Quantidade dos números: \n" +
                "Números Pares: " + pares + "\n" +
                "Números Impares: " + impares);
    }
}