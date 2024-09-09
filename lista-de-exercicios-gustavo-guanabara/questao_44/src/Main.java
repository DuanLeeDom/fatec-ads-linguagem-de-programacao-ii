import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int contador = leia.nextInt();

        System.out.print("Digite o último valor: ");
        int ultimo_valor = leia.nextInt();

        System.out.print("Digite o incremento: ");
        int inc = leia.nextInt();

        while (contador <= ultimo_valor) {
            System.out.print(contador + " ");
            contador = contador + inc;
        }
        System.out.print("Acabou!");
    }
}