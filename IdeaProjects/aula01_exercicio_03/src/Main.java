import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o pimeiro número: ");
        int n1 = leia.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = leia.nextInt();

        int soma = n1 + n2;

        if(soma%2==0){
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }
    }
}