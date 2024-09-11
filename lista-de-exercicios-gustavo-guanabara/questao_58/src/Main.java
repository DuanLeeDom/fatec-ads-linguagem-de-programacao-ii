import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random random = new Random();

        int idade = 0, alunos = 1, totidade = 0;
        boolean validacao = false;

        while (validacao == false) {
            System.out.print(alunos + "º Aluno | idade: ");
            idade = leia.nextInt();
            if (idade == 999){
                validacao = true;
                alunos = alunos - 1;
            } else {
                alunos = alunos + 1;
                totidade = totidade + idade;
            }
        }
        float media = totidade/alunos;
        if (validacao == true){
            System.out.println("---[ TELA FINAL ]--- \n" +
                    "Total de alunos: " + alunos + "\n" +
                    "Média de idade: " + media);
        }
    }
}