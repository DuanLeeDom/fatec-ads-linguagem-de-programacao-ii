import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int soma = 0, i;

        System.out.print("Informe o primeiro termo: ");
        int n1 = leia.nextInt();

        System.out.print("Informe a razão: ");
        int r = leia.nextInt();

        for (i = n1; i <= 10; i += r){
            if (i == n1){
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
            soma += i;
        }
        if (i >= 10){
            System.out.println("\n" +
                    "-------------------" + "\n" +
                    "Soma total: " + soma);
        }
    }
}