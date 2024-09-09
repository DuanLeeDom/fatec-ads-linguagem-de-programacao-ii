import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe que operação deseja realizar: \n" +
                "1) Adição \n" +
                "2) Subtração \n" +
                "3) Multiplicação \n" +
                "4) Divisão");

        System.out.print("Escolha o operador: ");
        int op = leia.nextInt();

        System.out.print("Digite o primeiro valor: ");
        int n1 = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = leia.nextInt();

        switch (op){
            case 1:
                System.out.println("A adição de " + n1 + " + " + n2 + " = " + (n1 + n2));
            break;
            case 2:
                System.out.println("A subtração de " + n1 + " - " + n2 + " = " + (n1 - n2));
            break;
            case 3:
                System.out.println("A multiplicação de " + n1 + " * " + n2 + " = " + (n1 * n2));
            break;
            case 4:
                System.out.println("A divisão de " + n1 + " / " + n2 + " = " + (n1 / n2));
            break;
            default:
                System.out.println("Opção Invalida!");
        }

    }

}