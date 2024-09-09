import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1,n2,soma = 0;

        System.out.print("Informe primeiro número: ");
        n1 = leia.nextInt();
        System.out.print("Informe segundo número: ");
        n2 = leia.nextInt();

        soma = n1+n2;

        if (soma > 10) {
            System.out.println("A soma é maior que 10");
        } else if (soma < 10) {
            System.out.println("A soma é menor que 10");
        } else if (soma == 10){
            System.out.println("A soma é igual a 10");
        }

    }
}