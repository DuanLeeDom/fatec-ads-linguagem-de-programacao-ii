import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao,dias = 0;

        System.out.print("Os meses do ano:  \n" +
                "1) Janeiro \n" +
                "2) Fevereiro \n" +
                "3) Março \n" +
                "4) Abril \n" +
                "5) Maio \n" +
                "6) Junho \n" +
                "7) Julho \n" +
                "8) Agosto \n" +
                "9) Setembro \n" +
                "10) Outrubro \n" +
                "11) Novembro \n" +
                "12) Dezembro \n" +
                "Informe o mês atual: ");
        opcao = leia.nextInt();

        if (opcao == 4 || opcao == 6 || opcao == 9 || opcao == 11) {
            System.out.println("tem 30 dias.");
        } else if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 5 || opcao == 7 || opcao == 8 || opcao == 10 || opcao == 12) {
            System.out.println("Tem 31 dias.");
        }
    }
}