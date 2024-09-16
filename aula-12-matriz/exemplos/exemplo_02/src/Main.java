import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matriz = {{"Olá", "Mundo"}, {"Hello", "World"}};

        System.out.println(matriz[0][0] + " " + matriz[0][1]);
        System.out.println(matriz[1][0] + " " + matriz[1][1]);
    }
}