package Tema7.ClasseAbstrata;

public class Zagueiro extends Jogador {
    public Zagueiro(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncaoTatica() {
        System.out.println(nome + " marca os atacantes adversários e intercepta jogadas.");
    }
}