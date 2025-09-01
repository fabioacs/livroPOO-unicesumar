package Tema4.Exemplo1;

public class Jogo {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();

        jogador.atacar();   // Metodo público
        jogador.carregarTextura();  // Metodo com acesso default (funciona no mesmo pacote)
        jogador.ganharExperiencia(20); // Metodo protegido (acessível no mesmo pacote)
        jogador.regenerarEnergia(); // ERRO: metodo privado (inacessível fora da classe)
        jogador.energia = 50;   // ERRO: atributo privado
        jogador.posicaoX = 5;   // OK: atributo default
        jogador.exibirStatus();
    }
}