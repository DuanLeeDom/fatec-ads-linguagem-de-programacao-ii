import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---[ O que você ira utilizar como combustível? ]---\n" +
                "1) Álcool\n" +
                "2) Gasolina\n" +
                "Qual das opções: ");
        int opcao = scanner.nextInt();

        System.out.print("Qual é o preço por [1] litro combustivel?: R$ ");
        double combustivelPreco = scanner.nextDouble();

        System.out.print("Qual será a distância percorrida?: Km ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("\n" +
                "---[ TELA FINAL ]---");
        calculo(opcao,combustivelPreco,distanciaPercorrida);

    }

    public static void calculo(int op, double cp, double dp){
        double consumoPorKm = 0;
        switch (op){
            case 1:
                consumoPorKm = 7.0;
                System.out.println("Combustível: Álcool");
                break;
            case 2:
                consumoPorKm = 10.0;
                System.out.println("Combustível: Gasolina");
                break;
            default:
                System.out.println("ERRO: a solicitação das opções está incorreta!");
                break;
        }
        double litrosNecessarios = dp / consumoPorKm;
        double custoTotal = litrosNecessarios * cp;

        System.out.println("Preço por litro: R$ " + cp + "\n" +
                "Distância percorrida: " + dp + "Km \n" +
                "Litros necessários: " + litrosNecessarios + " L \n" +
                "Custo total da viagem: R$" + custoTotal);
    }
}