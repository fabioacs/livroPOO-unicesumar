package Tema3;

public class FormaBombom {
    String formato;
    String cor;
    String recheio;

    void rechear(String recheio) {
        System.out.println("Adicionando recheio de " + recheio);
    }

    void gelar() {
        System.out.println("O bombom está no ponto.");
    }

    void embalar() {
        System.out.println("O bombom foi embalado.");
    }

    public static void main(String[] args) {
        FormaBombom bombom = new FormaBombom();
        bombom.formato = "redondo";
        bombom.cor = "preto";
        bombom.recheio = "maracujá";

        bombom.rechear(bombom.recheio);
        bombom.gelar();
        bombom.embalar();
    }
}