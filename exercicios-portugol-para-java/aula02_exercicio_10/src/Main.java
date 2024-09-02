import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String resposta;

        System.out.println("---[ Informe suas notas ]---");
        System.out.print("NOTA 1º: ");
        float n1 = leia.nextFloat();
        System.out.print("NOTA 2º: ");
        float n2 = leia.nextFloat();
        System.out.print("NOTA 3º: ");
        float n3 = leia.nextFloat();
        System.out.print("NOTA 4º: ");
        float n4 = leia.nextFloat();

        float media = (n4 + n2 + n3 + n4) / 4;

        System.out.print("Informe de 0% à 100% a sua frequência : ");
        int freq = leia.nextInt();

        if (freq >= 75) {
            if (media >= 7){
                resposta = "Aprovado";
            } else if (media >= 5 && media < 7) {
                resposta = "Exame";
            } else {
                resposta = "Repovado por nota";
            }
        } else {
            resposta = "Reprovado por frequência";
        }

        System.out.println("---[ RESULTADO FINAL ]--- \n" +
                "Média Final: " + media + "\n" +
                "Resultado: " + resposta);
    }
}