import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();
        int contador = 1, numeroAleatorio, numerosAcima5 = 0, numerosDivisiveis3 = 0;

        while (contador <= 20){
            numeroAleatorio = random.nextInt(10) + 0;
            System.out.println(contador + "º Número: " + numeroAleatorio);
            contador = contador + 1;
            if (numeroAleatorio > 5){
                numerosAcima5 = numerosAcima5 + 1;
            }
            if (numeroAleatorio%3 == 0){
                numerosDivisiveis3 = numerosDivisiveis3 + 1;
            }
        }
        System.out.println("---[ TELA FINAL ]---)");
        if (numerosAcima5 != 0){
            System.out.println("Números Acima de 5: " + numerosAcima5);
        }
        if (numerosDivisiveis3 != 0) {
            System.out.println("Números Divisiveis por 3: " + numerosDivisiveis3);
        }
    }
}