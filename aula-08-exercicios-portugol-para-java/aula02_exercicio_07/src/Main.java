import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = leia.nextInt();

        if (idade <= 7) {
            System.out.println("Infantil");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Juvenil");
        } else if (idade >= 11 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        }
    }
}