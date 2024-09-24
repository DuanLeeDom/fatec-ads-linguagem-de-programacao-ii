import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray = 4;
        int[] nota = new int[tamanhoArray];

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print((i + 1) + "° Nota: ");
            nota[i] = scanner.nextInt();
        }

        System.out.print("Informe sua porcentagem de presença: % ");
        double porcentagem = scanner.nextDouble();

        String result = calculo(nota[0],nota[1],nota[2],nota[3],porcentagem);

        System.out.println("Resultado: " + result);
    }

    public static String calculo(double n1, double n2, double n3, double n4, double freq){
        double media = (n1+n2+n3+n4)/4;
        String resultado = "";

        if (freq >= 75) {
            if (media >= 7){
                resultado = "APROVADO!";
            } else {
                if (media >= 5) {
                    resultado = "DEVE FAZER PROVA SUBSTITUITIVA!";
                } else {
                    resultado = "RETIDO!";
                }
            }
        } else {
            resultado = "RETIDO!";
        }
        return resultado;
    }
}