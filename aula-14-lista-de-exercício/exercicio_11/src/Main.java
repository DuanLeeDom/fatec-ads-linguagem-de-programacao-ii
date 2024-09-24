import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe quantidade de quilos do insumo: Kg");
        double quilos = scanner.nextDouble();

        System.out.print("Informe o valor do insumo por quilo: R$");
        double valorPorQuilo = scanner.nextDouble();

        double valorTotal = calcularValorTotal(quilos,valorPorQuilo);

        System.out.println("O valor total a ser pago é: R$" + valorTotal);
    }

    public static double calcularValorTotal(double quilos, double valorPorQuilo){
        double valorTotal = quilos * valorPorQuilo;

        if (valorPorQuilo < 59.98) {
            double taxaEntrega = 10.00;
            valorTotal += taxaEntrega;
            System.out.println("Uma taxa de entrega de R$10,00 foi aplicada.");
        }
        return valorTotal;
    }
}