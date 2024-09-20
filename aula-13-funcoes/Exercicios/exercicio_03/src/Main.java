import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Informe qual será a operação: \n" +
                "1) Soma \n" +
                "2) Subtração \n" +
                "3) Divisão \n" +
                "4) Multiplicação");
        int op = scanner.nextInt();

        operacoes(numero1,numero2,op);

    }

    public static void operacoes(int n1, int n2, int operacao) {
        switch (operacao){
            case 1:
                System.out.println("Resultado da soma: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) {
                    System.out.println("Resultado da divisão: " + (n1 / n2));
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            case 4:
                System.out.println("Resultado da multiplicação: " + (n1 * n2));
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}