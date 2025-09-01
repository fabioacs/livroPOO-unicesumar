package Tema7.ClasseAbstrata;

public class Atacante extends Jogador {
    public Atacante(String nome) {
        super(nome);
    }

    @Override
    public void executarFuncaoTatica() {
        System.out.println(nome + " busca espaços e finaliza as jogadas para marcar gols.");
    }
}