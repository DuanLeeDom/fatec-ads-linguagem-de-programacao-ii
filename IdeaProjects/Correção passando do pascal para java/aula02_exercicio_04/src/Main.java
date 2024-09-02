import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = leia.nextInt();

        if (num > 0){
            System.out.println("Número positivo!");
        }else if(num < 0){
            System.out.println("Número negativo!");
        }else{
            System.out.println("Número neutro!");
        }
    }
}