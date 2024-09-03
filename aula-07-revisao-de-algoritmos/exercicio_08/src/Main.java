import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor A: ");
        int a = leia.nextInt();
        System.out.print("Informe o valor B: ");
        int b = leia.nextInt();

        if (a > b) {
            System.out.println("A é maior que B");
        } else if (b > a) {
            System.out.println("B é maior que A");
        } else if (a == b){
            System.out.println("valores iguais.");
        } else {
            System.out.println("Informação inválida.");
        }
    }
}