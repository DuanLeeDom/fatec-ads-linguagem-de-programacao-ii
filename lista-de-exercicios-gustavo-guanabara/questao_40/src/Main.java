import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        while (contador < 20) {
            System.out.print(contador + " ");
            contador = contador + 3;
        }
        System.out.println("Acabou!");
    }
}