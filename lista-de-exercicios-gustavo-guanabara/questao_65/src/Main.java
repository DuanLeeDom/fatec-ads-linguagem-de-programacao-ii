import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        for (int i = 100; i >= 0; i = i-10){
            System.out.print(i + " ");
        }
        System.out.println("Acabou!");
    }
}