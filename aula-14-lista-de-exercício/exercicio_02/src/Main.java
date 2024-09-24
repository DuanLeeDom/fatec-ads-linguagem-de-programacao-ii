import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char valid;
        boolean flag = false;
        int n1;

        System.out.println("---[ TABUADA ]---");

        while (flag == false){
            System.out.print("Informe o número: ");
            n1 = scanner.nextInt();
            if (n1 == 0){
                System.out.println("Inválido número 0!");
                flag = true;
            } else if (n1 < 0){
                System.out.println("inválido número negativo!");
            } else {
                tabuada(n1);
            }

            System.out.print("Deseja continuar (S/N)?: ");
            valid = scanner.next().charAt(0);

            if (valid == 'S' || valid == 's'){
                flag = false;
            } else {
                flag = true;
            }
        }

        System.out.println("Programa Finalizado...");

    }
    public static void tabuada(int numero){
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " X " + numero + " = " + i*numero);
        }
    }
}