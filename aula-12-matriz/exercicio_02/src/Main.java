import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 4;
        int numNotas = 4;
        double[][] notas = new double[numAlunos][numNotas];

        for (int i = 0; i < numAlunos; i++){
            System.out.println("Digite as notas do aluno " + (i + 1) + ": ");
            for (int j = 0; j < numNotas; j++){
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        double somaSala = 0;
        System.out.println("\nMédias dos alunos: ");
        for (int i = 0; i < numAlunos; i++){
            double somaAluno = 0;
            for (int j = 0; j < numNotas; j++){
                somaAluno += notas[i][j];
            }
            double mediaAluno = somaAluno / numNotas;
            somaSala += somaAluno;
            System.out.printf("Aluno %d: Média = %.2f\n", (i + 1), mediaAluno);
        }

        double mediaSala = somaSala / (numAlunos * numNotas);
        System.out.printf("\nMédia geral da sala: %.2f\n", mediaSala);
    }
}