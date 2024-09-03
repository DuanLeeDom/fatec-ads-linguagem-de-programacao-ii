import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int mes = 0;

        System.out.print("Informe o mês atual (0-12): ");
        mes = leia.nextInt();

        int dias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
            case 2:
                System.out.print("Informe o ano: ");
                int ano = leia.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        }
        System.out.println("O mês " + mes + " tem " + dias + " dias.");
    }
}