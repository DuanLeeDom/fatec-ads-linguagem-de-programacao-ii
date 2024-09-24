import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Informe o número de parcelas");
        int parcelas = scanner.nextInt();

        double taxaJuros = 0.05;

        double valorComJuros = calcularJuros(valorCompra,parcelas,taxaJuros);

        System.out.println("---[ Detalhes do Parcelamento ]---\n" +
                "valor original da compra: R$" + valorCompra + "\n" +
                "valor total dos juros: " + valorComJuros + "\n" +
                "valor de cada parcela: R$" + (valorComJuros-valorCompra));
    }

    public static double calcularJuros(double valorCompra, int parcelas, double taxaJuros){
        double valorFinal = valorCompra * Math.pow(1 + taxaJuros,parcelas);
        return valorFinal;
    }
}