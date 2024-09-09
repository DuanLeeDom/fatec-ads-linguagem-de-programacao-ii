import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 1;
        int numero, soma = 0;

        while (contador <= 7){
            System.out.print("Informe o " + contador + "º número: ");
            numero = leia.nextInt();
            soma = soma + numero;
            contador = contador + 1;
        }
        System.out.println("\n" + "Soma total: " + soma);
    }
}