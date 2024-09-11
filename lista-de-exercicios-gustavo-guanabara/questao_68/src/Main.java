import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int cadastroF = 0, homempesa100 = 0;
        float mediaPesoF = 0, totPesoF = 0, maiorPesoM = 0;

        for (int i = 1; i <= 8; i++){
            System.out.println(i + "° ----------------------");
            System.out.print("Informe seu sexo (M/F): ");
            char sexo = leia.next().charAt(0);

            System.out.print("Informe seu peso: ");
            float peso = leia.nextFloat();

            if (sexo == 'F' || sexo == 'f'){
                cadastroF++;
                totPesoF += peso;
            }
            if (sexo == 'M' || sexo == 'm'){
                if (peso >= 100){
                    homempesa100++;
                }
                if (peso > maiorPesoM){
                    maiorPesoM = peso;
                }
            }
        }
        mediaPesoF = totPesoF/cadastroF;

        System.out.println("---[ TELA FINAL ]---");
        System.out.println("a) Quantas mulheres foram cadastradas: " + cadastroF);
        System.out.println("b) Quantos homens pesam mais de 100Kg: " + homempesa100);
        System.out.println("c) A média de peso entre as mulheres: " + mediaPesoF);
        System.out.println("d) O maior peso entre os homens: " + maiorPesoM);
    }
}