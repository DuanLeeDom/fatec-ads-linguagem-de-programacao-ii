import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 30;

        while (contador >= 0){
            if (contador%4 == 0){
                System.out.print("[" + contador + "]" + " ");
            } else {
                System.out.print(contador + " ");
            }
            contador = contador - 1;
        }
        System.out.print("Acabou");
    }
}