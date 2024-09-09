import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int op = 0;
        double n1,n2, res = 0;
        String ope = "";

        System.out.print("Informe o primeiro número: ");
        n1 = leia.nextDouble();

        System.out.print("Informe o segundo número: ");
        n2 = leia.nextDouble();

        System.out.print("1) Adição \n" +
                "2) Subtração \n" +
                "3) Multiplicação \n" +
                "4) Divisão \n" +
                "Escolha a alternativa :");
        op = leia.nextInt();

        switch (op) {
            case 1:
                ope = "Adição";
                res = n1 + n2;
                break;
            case 2:
                ope = "Subtração";
                res = n1 - n2;
                break;
            case 3:
                ope = "Multiplicação";
                res = n1 * n2;
                break;
            case 4:
                ope = "Divisão";
                res = n1 / n2;
                break;
            default:
                res = 0;
                break;
        }

        System.out.println("---[ TELA FINAL ]--- \n" +
                "Número 1º: " + n1 + "\n" +
                "Número 2º: " + n2 + "\n" +
                "Operador: " + ope + "\n" +
                "Resultado: " + res);
    }
}