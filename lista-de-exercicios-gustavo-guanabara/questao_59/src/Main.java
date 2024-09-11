import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char sexo, op;
        int contador = 1, idade = 0, idade_atual = 0, idadeHomen = 0, cadastroH = 0, maiorIdade = 0, idadeMulherJovem = 999, mediaHomens = 0;
        boolean flag = false;

        while (flag == false) {
            System.out.println("---------------" + contador + "----------------");
            System.out.print("Informe seu sexo(M/F): ");
            sexo = leia.next().charAt(0);

            System.out.print("Informe sua idade: ");
            idade = leia.nextInt();

            if (idade > idade_atual) {
                idade_atual = idade;
            }

            switch (sexo){
                case 'M':
                case 'm':
                    cadastroH = cadastroH + 1;
                    idadeHomen = idadeHomen + idade;
                    break;
                case 'F':
                case 'f':
                    if (idade < idadeMulherJovem) {
                        idadeMulherJovem = idade;
                    } else if (contador == 1) {
                        idadeMulherJovem = idade;
                    }
                    break;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            ++contador;

            System.out.print("Quer continuar (S/N)?: ");
            op = leia.next().toUpperCase().charAt(0);

            if (op == 'N' || op == 'n'){
                flag = true;
            }
        }
        if (cadastroH > 0){
            mediaHomens = idadeHomen / cadastroH;
        }

        System.out.println("---[ TELA FINAL ]--- \n" +
                "a) A maior idade lida: " + maiorIdade);
        System.out.println("b) Quantos homens foram cadastrados: " + cadastroH);
        if (idadeMulherJovem != 999) {
            System.out.println("c) A idade da mulher mais jovem: " + idadeMulherJovem);
        } else {
            System.out.println("c) A idade da mulher mais jovem: " + "Nenhum!");
        }
        System.out.println("d) qual é a média de idade entre os homens: " + mediaHomens);
    }
}