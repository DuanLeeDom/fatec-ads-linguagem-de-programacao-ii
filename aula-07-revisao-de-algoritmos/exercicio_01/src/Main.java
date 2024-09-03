import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String iden;
        float elev = 0;

        System.out.print("Informe um número: ");
        int n = leia.nextInt();

        if (n%2==0) {
            iden = "Par";
        } else {
            iden = "Ímpar";
            elev = n * n;
        }

        System.out.println("---[ RESULTADO FINAL ]--- \n" +
                "Identificador: " + iden);

        if (iden.equals("Ímpar")){
            System.out.println("Número Elevado: " + elev);
        }
    }
}