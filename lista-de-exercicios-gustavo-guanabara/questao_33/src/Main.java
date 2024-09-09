import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor da casa: $");
        float valorCasa = leia.nextFloat();

        System.out.print("Informe o seu salário: $");
        float salario = leia.nextFloat();

        System.out.print("Informe quantos anos irá pagar: ");
        int anos = leia.nextInt();

        float prestacaoMensal = valorCasa/ (anos * 12);
        float limitePrestacao = salario * 0.3f;

        if (prestacaoMensal <= limitePrestacao){
            System.out.printf("Empréstimo Aprovado! " +
                    "A prestação mensal será de R$%.2f\n", prestacaoMensal);
        } else {
            System.out.printf("Empréstimo Negado! " +
                    "A prestação mensal (R$%.2f) excede 30%% do seu salário. \n", prestacaoMensal);
        }
    }
}