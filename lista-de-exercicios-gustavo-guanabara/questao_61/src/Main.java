import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        do {
            System.out.print(contador + " ");
            contador += 3;
        } while (contador <= 30);
        System.out.println("Acabou!");
    }
}