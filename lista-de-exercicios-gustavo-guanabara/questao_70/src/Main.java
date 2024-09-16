import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int t1 = 0, t2 = 1, t3 = 0;

        for (int i = 1; i <= 10; i++){
            t3 = t1 + t2;
            System.out.print(t1 + " ");
            t1 = t2;
            t2 = t3;
        }
        System.out.print("...");
    }
}