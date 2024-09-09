import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 6;
        int soma = 0;

        while (contador <= 100){
            soma = soma + contador;
            System.out.print(contador + " ");
            contador = contador + 2;
        }
        System.out.println("\n" + "Soma total: " + soma);
    }
}