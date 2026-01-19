public class ConversorMoeda {

    double cotacaoDolar = 4.90;
    double cotacaoEuro = 5.30;

    public double converteParaDolar(double valorEmReais) {
        return valorEmReais / cotacaoDolar;
    }

    public double converteParaEuro(double valorEmReais) {
        return valorEmReais / cotacaoEuro;
    }
}
