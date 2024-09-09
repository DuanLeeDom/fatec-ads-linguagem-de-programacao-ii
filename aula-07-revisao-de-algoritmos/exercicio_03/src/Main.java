import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, nMaior = 0;
        String resultado = "";

        System.out.print("Informe o primeiro número: ");
        n1 = leia.nextInt();

        System.out.print("Informe o segundo número: ");
        n2 = leia.nextInt();

        if (n1 > n2) {
            nMaior = n1;
            resultado = "1º Primeiro Número";
        } else if (n2 > n1) {
            nMaior = n2;
            resultado = "2º Segundo Número.";
        } else if (n1 == n2) {
            resultado = "Números Iguais.";
        }

        if (n1 != n2) {
            System.out.println("Maior número: " + nMaior);
        } else {
            System.out.println("Resultado: " + resultado);
        }
    }
}