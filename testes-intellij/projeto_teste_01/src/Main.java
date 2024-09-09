import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome, v;

        System.out.println("---[ BEM-VÍNDO ]---");
        System.out.print("Informe seu nome: ");
        nome = leia.next();
        System.out.println("Seu nome é " + nome);
        System.out.print("Esse é realmente seu nome (S/N): ");
        v = leia.next();

        // verificação COMO FAZER A VERIFICAÇÃO DE DUAS OU MAIS COISAS
        // como usar o 'e' e 'ou' = '&& = e' '|| = ou'
        if (v.equals("s") || v.equals("S")) {
            System.out.println("CERTO É SEU NOME: " + nome);
        }else{
            System.out.println("NÃO É SEU NOME: " + nome);
        }
    }
}