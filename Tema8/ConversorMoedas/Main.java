package Tema8.ConversorMoedas;

public class Main {
    public static void main(String[] args) {
        double valor = 100.0;
        double convertido = ConversorMoeda.converter(valor, Moeda.USD, Moeda.EUR);

        System.out.printf("USD %.2f equivale a EUR %.2f%n", valor, convertido);
    }
}