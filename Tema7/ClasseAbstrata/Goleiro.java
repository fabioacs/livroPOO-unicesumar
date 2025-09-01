package Tema7.ClasseAbstrata;

public class Goleiro extends Jogador {
    public Goleiro(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncaoTatica() {
        System.out.println(nome + " defende o gol e organiza a defesa.");
    }
}