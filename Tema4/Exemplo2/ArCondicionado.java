package Tema4.Exemplo2;

public class ArCondicionado {
    // Atributos privados para proteger os dados internos do objeto
    private int temperaturaAtual;
    private int temperaturaDesejada;
    private boolean ligado;

    // Construtor que inicializa o ar-condicionado com valores padrão
    public ArCondicionado() {
        this.temperaturaAtual = 24;
        this.temperaturaDesejada = 24;
        this.ligado = false;
    }

    // Métodos públicos para acessar os dados (getters)
    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public int getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public boolean isLigado() {
        return ligado;
    }

    // Metodo público para alterar a temperatura desejada com validação
    public void setTemperaturaDesejada(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperaturaDesejada = temperatura;
            System.out.println("Temperatura desejada ajustada para " + temperatura + "°C");
        } else {
            System.out.println("Temperatura fora do intervalo permitido (16°C - 30°C).");
        }
    }

    // Métodos públicos para ligar e desligar o aparelho
    public void ligar() {
        this.ligado = true;
        System.out.println("Ar-condicionado ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }

    // Metodo com acesso package-private para simular atualização interna da temperatura
    void atualizarTemperaturaAtual() {
        if (ligado) {
            if (temperaturaAtual < temperaturaDesejada) {
                temperaturaAtual++;
            } else if (temperaturaAtual > temperaturaDesejada) {
                temperaturaAtual--;
            }
        }
    }
}
