import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        System.out.print("Informe um número para realizar a tabuada: ");
        int n = leia.nextInt();

        if (n != 0){
            while (contador <= 10) {
                System.out.println(contador + " x " + n + " = " + contador*n);
                contador = contador + 1;
            }
        }
    }
}