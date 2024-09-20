import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número |N1|: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o segundo número |N2|: ");
        int numero2 = scanner.nextInt();

        Divisivel(numero1,numero2);
    }

    public static void Divisivel(int n1, int n2){
        if (n1 % n2 == 0){
            System.out.println("N1 é divisivel por N2");
        }else{
            System.out.println("N1 não é divisivel por N2");
        }
    }
}