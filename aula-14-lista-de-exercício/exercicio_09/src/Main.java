import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salario = new double[3];
        int i = 0;

        do {
            System.out.print((i + 1) + "°) Informe o salario: R$");
            salario[i] = scanner.nextDouble();
            i++;
        } while (i < 3);

        double maSalario = MaiorSalario(salario[0],salario[1],salario[2]);
        double meSalario = MenorSalario(salario[0],salario[1],salario[2]);

        System.out.println("---[ Tela Final ]---\n" +
                "O maior salário: " + maSalario + "\n" +
                "O menor salário: " + meSalario);
    }

    public static double MaiorSalario(double s1,double s2,double s3){
        double maior = s1;
        if (s2 > maior){
            maior = s2;
        }
        if (s3 > maior){
            maior = s3;
        }
        return maior;
    }

    public static double MenorSalario(double s1,double s2,double s3){
        double menor = s1;
        if (s2 < menor){
            menor = s2;
        }
        if (s3 < menor){
            menor = s3;
        }
        return menor;
    }
}