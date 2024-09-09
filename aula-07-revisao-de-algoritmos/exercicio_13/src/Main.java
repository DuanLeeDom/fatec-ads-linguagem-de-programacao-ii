import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String resultado = "";

        System.out.print("Informe seu sexo m | Masculino - f | Feminino: ");
        char sexo = leia.next().charAt(0);

        System.out.print("Informe seu peso: ");
        float peso = leia.nextFloat();

        System.out.print("Informe sua altura: ");
        float altura = leia.nextFloat();

        double imc = (peso/(altura*altura));

        switch (sexo) {
            case 'm':
            case 'M':
                if (imc >= 18 && imc <= 25) {
                    resultado = "Normal";
                } else if (imc > 25 && imc < 30) {
                    resultado = "Sobrepeso";
                } else if (imc >= 30 && imc < 35){  // add
                    resultado = "Obesidade Leve";
                } else if (imc >= 35 && imc < 40) {
                    resultado = "Obesidade Moderada";
                } else if (imc >= 40 && imc <= 50) { // add
                    resultado = "Obesidade Severa";
                } else if (imc > 50) {
                    resultado = "Obesidade Gravíssima";
                }
                break;
            case 'f':
            case 'F':
                if (imc >= 18 && imc <= 24) {
                    resultado = "Normal";
                } else if (imc >= 25 && imc <= 30) {
                    resultado = "Sobrepeso";
                } else if (imc > 30 && imc < 35 ) {
                    resultado = "Sobrepeso Leve";
                } else if (imc >= 35 && imc <= 40) {
                    resultado = "Obesidade Moderada";
                } else if (imc >= 40 && imc <= 50) {
                    resultado = "Obesidade Severa";
                } else if (imc >= 50) {
                    resultado = "Obesidade Gravíssima";
                }
                break;
        }

        System.out.println("---[ TELA FINAL ]--- \n" +
                "Seu IMC: " + imc + "\n" +
                "Resultado: " + resultado);
    }
}