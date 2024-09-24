import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro 1° número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Informe o segundo 2° número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Operações \n" +
                "1) soma \n" +
                "2) subtração \n" +
                "3) divisão \n" +
                "4) multiplicação \n" +
                "Escolha a operação: ");
        int op = scanner.nextInt();

        double result = calculo(n1,n2,op);

        System.out.println("---[ Tela Final ]---\n" +
                "numero 1: " + n1 + "\n" +
                "numero 2: " + n2 + "\n" +
                "opção: " + op + "\n" +
                "Resultado: " + result);
    }
    public static double calculo(double numero1,double numero2, int opcao){
        double resultado = 0;

        switch (opcao){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 / numero2;
                break;
            case 4:
                resultado = numero1 * numero2;
                break;
            default:
                System.out.println("Erro!");
                break;
        }
        return resultado;
    }
}