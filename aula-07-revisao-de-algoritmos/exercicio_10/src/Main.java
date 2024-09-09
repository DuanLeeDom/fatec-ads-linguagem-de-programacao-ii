import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao = 0;
        double salario, porc, resultado = 0;
        String categ = "";

        System.out.print("1) Vendedor \n" +
                "2) Gerente \n" +
                "3) Coordenador \n" +
                "Informe a sua categoria: ");
        opcao = leia.nextInt();

        System.out.print("Informe seu salario: $");
        salario = leia.nextFloat();

        switch (opcao) {
            case 1:
                categ = "Vendedor";
                porc = 0.10;
                break;
            case 2:
                categ = "Gerente";
                porc = 0.13;
                break;
            case 3:
                categ = "Coordenador";
                porc = 0.15;
                break;
            default:
                categ = "";
                porc = 0.00;
                break;
        };

        resultado = salario + salario * porc;

        System.out.println("---[ TELA FINAL ]--- \n" +
                "Categoria: " + categ + "\n" +
                "Salario reajustado: " + resultado + "\n" +
                "Porcentagem: %" + porc*100);
    }
}