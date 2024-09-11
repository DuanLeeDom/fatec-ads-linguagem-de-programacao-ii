import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("---[ TABUADA ]---");
        System.out.print("Informe o numero: ");
        int n = leia.nextInt();

        System.out.println("----------------------");
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " X " + n + " = " + i*n);
        }
    }
}