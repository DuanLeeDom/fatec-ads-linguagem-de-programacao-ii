import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n = 0;

        System.out.print("Informe um número: ");
        n = leia.nextInt();

        System.out.print("Tabuada de 0-10: \n" +
                n + " x " + "0 " + " = " + n*0 + "\n" +
                n + " x " + "1 " + " = " + n*1 + "\n" +
                n + " x " + "2 " + " = " + n*2 + "\n" +
                n + " x " + "3 " + " = " + n*3 + "\n" +
                n + " x " + "4 " + " = " + n*4 + "\n" +
                n + " x " + "5 " + " = " + n*5 + "\n" +
                n + " x " + "6 " + " = " + n*6 + "\n" +
                n + " x " + "7 " + " = " + n*7 + "\n" +
                n + " x " + "8 " + " = " + n*8 + "\n" +
                n + " x " + "9 " + " = " + n*9 + "\n" +
                n + " x " + "10 " + " = " + n*10  );
    }
}