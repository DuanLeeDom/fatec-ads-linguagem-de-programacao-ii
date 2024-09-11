import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float salario = 0, tothomens = 0, totmulheres = 0;
        char sexo, op;
        boolean validacao = false;

        System.out.println("---[ INFORME SEU SEXO E SALÁRIO ]---");
        while (validacao == false) {
            System.out.print("Informe seu salário: $");
            salario = leia.nextFloat();

            System.out.print("Informe seu sexo (M/F): ");
            sexo = leia.next().charAt(0);

            switch (sexo){
                case 'M':
                case 'm':
                    tothomens = tothomens + salario;
                    break;
                case 'F':
                case 'f':
                    totmulheres = totmulheres + salario;
                    break;
            }
            System.out.print("Deseja terminar o programa(S/N): ");
            op = leia.next().charAt(0);

            switch (op) {
                case 'S':
                case 's':
                    validacao = true;
                    break;
                case 'N':
                case 'n':
                    validacao = false;
                    break;
            }
        }
        if (validacao == true) {
            System.out.println("\n" +
                    "---[ TOTAL DE SALÁRIOS ]---" + "\n" +
                    "Salário de homens: $" + tothomens + "\n" +
                    "Salário de mulheres: $" + totmulheres);
        }
    }
}