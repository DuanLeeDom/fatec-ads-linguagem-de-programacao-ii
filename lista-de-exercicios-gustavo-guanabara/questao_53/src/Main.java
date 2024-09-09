import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade = 0, contador = 1, quantidade_m = 0, quantidade_f = 0, somaIdadeGrupo = 0, somaIdadeHomens = 0,  idadeAcima20 = 0;
        float mediaGrupo = 0, mediaHomens = 0;
        char sexo;
        String result_sexo;

        while (contador <= 5){
            System.out.println("---[ " + contador + "º Pessoa! ]---");

            System.out.print("Informe sua idade: ");
            idade = leia.nextInt();

            System.out.print("Informe o seu sexo(M/F): ");
            sexo = leia.next().charAt(0);
            // --------------------------------------
            switch (sexo) {
                case 'm':
                case 'M':
                    quantidade_m = quantidade_m + 1;
                    somaIdadeHomens = somaIdadeHomens + idade;
                    break;
                case 'f':
                case 'F':
                    if (idade >= 20){
                        idadeAcima20 = idadeAcima20 + 1;
                    }
                    quantidade_f = quantidade_f + 1;
                    break;
                default:
            }
            // --------------------------------------
            somaIdadeGrupo = somaIdadeGrupo + idade;
            contador = contador + 1;
        }
        mediaGrupo = somaIdadeGrupo/5;
        mediaHomens = somaIdadeHomens/quantidade_m;

        System.out.println("---[ TELA FINAL ]--- \n" +
                "a) Quantos homens foram cadastrados: " + quantidade_m + "\n" +
                "b) Quantas mulheres foram cadastradas: " + quantidade_f + "\n" +
                "c) A média de idade do grupo: " + mediaGrupo + "\n" +
                "d) A média de idade dos homens: " + mediaHomens + "\n" +
                "e) Quantas mulheres tem mais de 20 anos: " + idadeAcima20);
    }
}