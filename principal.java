import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.println("=== CONVERSOR DE MOEDAS ===");
        System.out.println("Digite o valor em reais:");
        double valor = leitura.nextDouble();

        System.out.println("Escolha a moeda:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");

        int opcao = leitura.nextInt();

        if (opcao == 1) {
            double resultado = conversor.converteParaDolar(valor);
            System.out.println("Valor em dólar: " + resultado);
        } else if (opcao == 2) {
            double resultado = conversor.converteParaEuro(valor);
            System.out.println("Valor em euro: " + resultado);
        } else {
            System.out.println("Opção inválida!");
        }

        leitura.close();
    }
}
