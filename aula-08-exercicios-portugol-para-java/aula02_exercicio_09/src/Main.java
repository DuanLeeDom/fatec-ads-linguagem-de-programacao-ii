import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String resultado = "";

        System.out.print("Informe o sexo: M = Masculino | F = Feminino: ");
        char sexo = leia.next().charAt(0);

        System.out.print("Qual é seu peso: ");
        float peso = leia.nextFloat();

        System.out.print("Qual é sua altura: ");
        float altura = leia.nextFloat();

        float imc = peso / (altura * altura);

        switch (sexo) {
            case 'm':
            case 'M':
                if (imc >= 18 && imc <= 25) {
                    resultado = "Normal";
                } else if (imc >= 26 && imc <= 30) {
                    resultado = "Sobrepeso";
                } else if (imc >= 31 && imc <= 42) {
                    resultado = "Obesidade Moderada";
                } else if (imc > 42) {
                    resultado = "Obesidade Gravíssima";
                } else {
                    resultado = "ERRO!";
                }
                break;
            case 'f':
            case 'F':
                if (imc >= 18 && imc <= 24) {
                    resultado = "Normal";
                } else if (imc >= 25 && imc <= 30) {
                    resultado = "Sobrepeso";
                } else if (imc >= 31 && imc <= 40) {
                    resultado = "Obesidade Moderada";
                } else if (imc > 40) {
                    resultado = "Obesidade Gravíssima";
                } else {
                    resultado = "ERRO!";
                }
                break;
            default:
                resultado = "Sexo inválido!";
                break;
        }

        System.out.println("Resultado: " + resultado);
    }
}