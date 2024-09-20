import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---[ CONVERSOR DE DOLAR ($) PARA REAIS (R$) ]---\n" +
                "Informe quantidade de Dolar: $");
        double dolar = scanner.nextDouble();

        double convertido = conversor(dolar);

        System.out.println("Aconverção de Dolar para Reais foi: ");
        System.out.print("R$ " + convertido);
    }

    public static double conversor(double dol) {
        return dol * 5.50;
    }
}