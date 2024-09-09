import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 50;

        while (contador >= 40){
            System.out.print(" " + contador);
            contador = contador - 1;
        }

        contador = 50;
        System.out.println();
        do {
            System.out.print(" " + contador);
            contador = contador - 1;
        } while (contador >= 40);
    }
}