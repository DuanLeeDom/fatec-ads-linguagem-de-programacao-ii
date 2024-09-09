import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 500;
        int soma = 0;

        while (contador >= 0){
            soma = soma + contador;
            System.out.print(contador + " ");
            contador = contador - 50;
        }
        System.out.println("\n" + "Soma total: " + soma);

    }
}