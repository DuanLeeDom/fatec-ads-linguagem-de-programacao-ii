import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char op;
        int contador = 0, soma = 0, idade = 0, mais21 = 0;

        do {
            contador++;
            System.out.println(contador + "° ------------------------");
            System.out.print("Informe sua idade: ");
            idade = leia.nextInt();
            System.out.print("Quer continuar? (S/N): ");
            op = leia.next().charAt(0);
            soma += idade;
            if (idade >= 21){
                mais21++;
            }
        } while (op == 'S' || op == 's');
        if (op == 'N' || op == 'n'){
            int media = soma/contador;

            System.out.println("---[ TELA FINAL ]---");
            System.out.println("a) Quantas idades foram digitadas: " + contador);
            System.out.println("b) Qual é a média entre as idades digitadas: " + media);
            System.out.println("c) Quantas pessoas tem 21 anos ou mais: " + mais21);
        }
    }
}