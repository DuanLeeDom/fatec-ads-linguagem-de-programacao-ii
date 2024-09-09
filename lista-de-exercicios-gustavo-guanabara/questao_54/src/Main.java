import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 1;
        int categoria1 = 0, categoria2 = 0, categoria3 = 0;
        float totAltura = 0;

        while (contador <= 7) {
            // --------------------------
            System.out.println("---[ " + contador + "º Pessoa! ]---");
            System.out.print("Informe seu peso: ");
            float peso = leia.nextFloat();

            System.out.print("Informe sua altura: ");
            float altura = leia.nextFloat();

            totAltura += altura;

            if (peso >= 90) {
                categoria1 = categoria1 + 1;
            }
            if (peso <= 50 && altura <= 1.60) {
                categoria2 = categoria2 + 1;
            }
            if (altura >= 1.90 && peso >= 100) {
                categoria3 = categoria3 + 1;
            }
            // --------------------------
            contador = ++contador;
        }
        float mediaAltura = totAltura/7;

        System.out.println("---[ TELA FINAL ]--- \n" +
                "a) Qual foi a média de altura do grupo: " + mediaAltura + "\n" +
                "b) Quantas pessoas pesam mais de 90Kg: " + categoria1 + "\n" +
                "c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m: " + categoria2 + "\n" +
                "d) Quantas pessoas que medem mais de 1. 90m pesam mais de 100Kg: " + categoria3);
    }
}