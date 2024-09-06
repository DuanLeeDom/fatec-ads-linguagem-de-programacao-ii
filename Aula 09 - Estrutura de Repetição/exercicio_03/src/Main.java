import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 1;

        while (contador <= 30){
            if (contador%2 != 0) {
                System.out.print(contador + " ");
            }
            contador = contador + 1;
        }
    }
}