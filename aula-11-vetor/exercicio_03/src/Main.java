import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
                "Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};

        int[] dias = {
                31, 28, 31, 30, 31, 30, 31, 31,
                30, 31, 30, 31
        };

        System.out.println("---[ MESES DO ANO E SEUS DIAS ]---");
        for (int i = 0; i < 12; i++){
            System.out.println((i + 1) + "° mês: " + meses[i] + ", esse mês tem " + dias[i] + " dias.");
        }
    }
}