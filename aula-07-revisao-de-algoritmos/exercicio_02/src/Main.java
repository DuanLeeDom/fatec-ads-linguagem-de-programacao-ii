import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String resultado = "";

        System.out.print("Informe a nota 1º: ");
        float n1 = leia.nextFloat();

        System.out.print("Informe a nota 2º: ");
        float n2 = leia.nextFloat();

        System.out.print("Informe a nota 3º: ");
        float n3 = leia.nextFloat();

        System.out.print("Informe a nota 4º: ");
        float n4 = leia.nextFloat();

        System.out.print("Informe sua frequência: ");
        int freq = leia.nextInt();

        float media = (n1 + n2 + n3 + n4)/4;

        if (freq >= 75) {
            if (media >= 7) {
                resultado = "Aprovado";
            } else if (media < 7) {
                resultado = "Reprovado";
            }
        } else {
            resultado = "Reprovado por frequência";
        }

        System.out.println("---[ TELA FINAL ]--- \n" +
                "Média do aluno: " + media + "\n" +
                "Resultado: " + resultado);
    }
}