import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contador = 1;
        float produto = 0, produto_ant = 0, menorPreco = 0, maiorPreco = 0;

        System.out.println("---[ IDENTIFICADOR DE PRODUTOS ]---");

        while (contador <= 8){
            System.out.print("Informe o " + contador + "º produto: $");
            produto = leia.nextFloat();

            if (contador == 1){
                menorPreco = produto;
                maiorPreco = produto;
            } else if (produto > maiorPreco) {
                maiorPreco = produto;
            } else if (produto <= menorPreco) {
                menorPreco = produto;
            }
            contador = ++contador;
        }
        System.out.println("---[ TELA FINAL ]---- \n" +
                "Menor Preço: $" + menorPreco + "\n" +
                "Maior Preço: $" + maiorPreco);
    }
}