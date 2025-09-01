package Tema8.ConversorMoedas;

public enum Moeda {
    USD(5.21),
    EUR(6.09),
    GBP(6.15);


    private final double taxaEmReais;


    Moeda(double taxa) {
        this.taxaEmReais = taxa;
    }


    public double getTaxaEmReais() {
        return taxaEmReais;
    }
}