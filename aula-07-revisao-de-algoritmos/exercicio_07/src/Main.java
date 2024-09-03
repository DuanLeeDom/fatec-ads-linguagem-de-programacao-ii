import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int hora = 0;

        System.out.print("Informe o hora (0-23): ");
        hora = leia.nextInt();

        if (hora >= 0 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora < 24) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}