package Tema8.ConversorMoedas;

public class ConversorMoeda {
    public static double converter(double valor, Moeda
            origem, Moeda destino) {
        double valorEmReais = valor *
                origem.getTaxaEmReais();
        return valorEmReais / destino.getTaxaEmReais();
    }
}