package br.com.alura.conversor.principal;

import br.com.alura.conversor.service.ConsultaMoeda;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsultaMoeda consulta = new ConsultaMoeda();

    public void exibeMenu() {
        int opcao = -1;
        while (opcao != 0) {
            String menu = """
                ***************************************************
                Seja bem-vindo ao Conversor de Moeda!
                
                1) Dólar => Real
                2) Real => Dólar
                3) Dólar => Peso argentino
                4) Peso argentino => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                0) Sair
                Escolha uma opção válida:
                ***************************************************
                """;
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 0) break;

            System.out.println("Digite o valor que deseja converter:");
            double valor = leitura.nextDouble();

            switch (opcao) {
                case 1 -> realizarConversao("USD", "BRL", valor);
                case 2 -> realizarConversao("BRL", "USD", valor);
                case 3 -> realizarConversao("USD", "ARS", valor);
                case 4 -> realizarConversao("ARS", "USD", valor);
                case 5 -> realizarConversao("USD", "COP", valor);
                case 6 -> realizarConversao("COP", "USD", valor);
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private void realizarConversao(String base, String alvo, double valor) {
        try {
            var moeda = consulta.buscaMoeda(base);
            double taxa = moeda.conversion_rates().get(alvo);
            double resultado = valor * taxa;
            System.out.printf("O valor %.2f [%s] corresponde ao valor final de =>>> %.2f [%s]%n",
                    valor, base, resultado, alvo);
        } catch (Exception e) {
            System.out.println("Erro ao converter: " + e.getMessage());
        }
    }
}