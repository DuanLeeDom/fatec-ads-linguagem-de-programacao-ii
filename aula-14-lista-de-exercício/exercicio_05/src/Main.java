import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe que tipo de combustível ira utilizar: \n" +
                "1) Álcool \n" +
                "2) Gasolina \n" +
                "Informe sua resposta: ");
        int opcao = scanner.nextInt();

        System.out.print("Qual é o preço do combustível?: ");
        double combustivel = scanner.nextDouble();

        System.out.print("Qual será a distância em quilômetros: Km ");
        double distancia = scanner.nextDouble();

        calculo(opcao,combustivel,distancia);
    }

    public static void calculo(int op, double c, double d){
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
        double litrosNecessarios = d / consumoPorKm;
        double custoTotal = litrosNecessarios * c;

        System.out.println("Preço por litro: R$ " + c + "\n" +
                "Distância percorrida: " + d + "Km \n" +
                "Litros necessários: " + litrosNecessarios + "L \n" +
                "Custo total da viagem: " + custoTotal);
    }
}