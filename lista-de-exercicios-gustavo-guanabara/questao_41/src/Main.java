import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 100;

        while (contador >= 0){
            System.out.print(contador + " ");
            contador = contador - 5;
        }
        System.out.println("Acabou!");
    }
}