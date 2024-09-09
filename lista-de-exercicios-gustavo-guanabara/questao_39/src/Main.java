import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 10;

        while (contador > 2) {
            System.out.print(contador + " ");
            contador = contador - 1;
        }
        System.out.println("Acabou!");
    }
}