import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número");
        float numero = leia.nextFloat();

        if (numero > 7) {
            System.out.println("Número maior que 7");
        }else if (numero < 7){
            System.out.println("número menor que 7");
        }
        else{
            System.out.println("Número igual a 7");
        }
    }
}