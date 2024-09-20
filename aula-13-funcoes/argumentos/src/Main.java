public class Main {
    public static void saudacaoSimples() {
        System.out.println("Olá, Mundo!");
    }

    public static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static int obterNumeroAleatorio() {
        return (int) (Math.random() * 100);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        saudacaoSimples();

        exibirMensagem("Mensagem Recebida!");

        int numero = obterNumeroAleatorio();
        System.out.println("Número aleatorio: " + numero);

        int resultado = somar(5,3);
        System.out.println("Resultado da soma: " + resultado);
    }
}