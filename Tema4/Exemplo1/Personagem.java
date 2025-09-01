package Tema4.Exemplo1;

public class Personagem {

    private int energia = 100; // Somente a própria classe pode acessar
    int posicaoX = 0; // Default: acessível dentro do mesmo pacote
    protected int experiencia = 0; // Protected: acessível no mesmo pacote

    public void atacar() {
        System.out.println("O personagem atacou!");
        energia -= 10;
    }

    protected void ganharExperiencia(int pontos) {
        experiencia += pontos;
        System.out.println("Ganhou " + pontos + " pontos de experiência!");
    }

    void carregarTextura() {
        System.out.println("Textura carregada com sucesso.");
    }

    private void regenerarEnergia() {
        energia = 100;
        System.out.println("Energia regenerada.");
    }

    public int getEnergia() {
        return energia;
    }

    public void exibirStatus() {
        System.out.println("Energia: " + energia);
        System.out.println("Experiência: " + experiencia);
        System.out.println("Posição X: " + posicaoX);
    }
}