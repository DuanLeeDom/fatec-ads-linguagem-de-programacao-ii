import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 1, n = 0, soma = 0, media = 0, quantidade18 = 0, quantidade5 = 0, maiorIdade = 0, nAnterior = 0;

        while (i <= 10){
            nAnterior = n;
            System.out.print("Informe a " + i + "º idade: ");
            n = leia.nextInt();
            soma = soma + n;
            if (n == 0) {
                quantidade18 = n;
                quantidade5 = n;
            } else if (n <= 5) {
                quantidade5 = quantidade5 + 1;
            } else if (n >= 18) {
                quantidade18 = quantidade18 + 1;
            }
            if (n > nAnterior){
                maiorIdade = n;
            }
            i = ++i;
        }
        media = soma/10;

        System.out.println("a) Qual é a média de idade do grupo: " + media + "\n" +
                "b) Quantas pessoas tem mais de 18 anos: " + quantidade18 + "\n" +
                "c) Quantas pessoas tem menos de 5 anos: " + quantidade5 + "\n" +
                "d) Qual foi a maior idade lida: " + maiorIdade);
    }
}