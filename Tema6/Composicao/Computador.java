package Tema6.Composicao;

public class Computador {
    private Impressora impressora;

    public Computador(Impressora impressora) {
        this.impressora = impressora;
    }

    public void enviarParaImpressao() {
        impressora.imprimir();
    }
}