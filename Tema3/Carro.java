package Tema3;

class Carro {
    private String cor;
    private String modelo;
    private int anoFabricacao;
    private int velocidadeAtual;

    void acelerar() {
        velocidadeAtual += 10;
    }

    void frear() {
        velocidadeAtual -= 10;
    }

    void ligar() {
        System.out.println("Carro ligado");
    }
}