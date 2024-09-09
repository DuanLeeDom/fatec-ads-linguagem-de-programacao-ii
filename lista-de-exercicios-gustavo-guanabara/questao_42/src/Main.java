import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        System.out.print("Digite um valor: ");
        int quantidade = leia.nextInt();

        while (quantidade >= contador) {
            System.out.print(contador + " ");
            contador = contador + 1;
        }
        System.out.print("Acabou!");
    }
}