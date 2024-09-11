import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome, pessoaVelha = "", pessoaJovem = "";
        int idade = 0, maiorIdade = 0, idadeAnt_m = 0, mediaGrupo = 0, homensAcima30 = 0, mulheresAbaixo18 = 0, contador = 0;
        int somaIdade = 0;
        char sexo, op;
        boolean flag = false;

        while (flag == false){
            contador++;
            System.out.println(contador + "º ------------");
            System.out.print("Informe seu nome: ");
            nome = leia.next();
            System.out.print("Informe sua idade: ");
            idade = leia.nextInt();
            System.out.print("Informe seu sexo (M/F): ");
            sexo = leia.next().charAt(0);

            if (idade > maiorIdade) {
                maiorIdade = idade;
                pessoaVelha = nome;
            }

            if (sexo == 'F' || sexo == 'f'){
                if (idade < mulheresAbaixo18){
                    mulheresAbaixo18 = idade;
                    pessoaJovem = nome;
                }

                if (idade < 18){
                    mulheresAbaixo18++;
                }
            }
            if (sexo == 'M' || sexo == 'm'){
                if (idade > 30){
                    homensAcima30++;
                }
            }
            somaIdade += idade;

            System.out.print("Deseja terminar (S/N)?: ");
            op = leia.next().charAt(0);

            if (op == 'S' || op == 's'){
                flag = true;
            }
        }
        // ---normal
        mediaGrupo = somaIdade/contador;
        // ---Tela Final
        if (flag == true){
            System.out.println("---[ TELA FINAL ]--- \n" +
                    "a) O nome da pessoa mais velha: " + pessoaVelha + "\n" +
                    "b) O nome da mulher mais jovem: " + pessoaJovem + "\n" +
                    "c) A média de idade do grupo: " + mediaGrupo + "\n" +
                    "d) Quantos homens tem mais de 30 anos: " + homensAcima30 + "\n" +
                    "e) Quantas mulheres tem menos de 18 anos: " + mulheresAbaixo18);
        }
    }
}