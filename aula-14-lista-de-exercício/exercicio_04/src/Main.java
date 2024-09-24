import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---[ Conversor de Dólar para Real ]---\n" +
                "Informe o dolar: $");
        double dolar = scanner.nextDouble();

        double result = conversor(dolar);

        System.out.println("---[ Tela Final ]---\n" +
                "converção vai ficar: R$ " + result);
    }
    public static double conversor(double d){
        double resultado = 0;

        resultado = d * 5.50;

        return resultado;
    }
}