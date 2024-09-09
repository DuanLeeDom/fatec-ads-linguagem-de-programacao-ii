import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 1;

        while (contador <= 500) {
            System.out.print(" " + contador);
            contador = contador + 1; // 1º Jeito de adicionar
          //contador ++;             //2º Jeito de adicionar
        }
    }
}