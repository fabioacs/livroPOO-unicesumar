package Tema7.ClasseAbstrata;

public abstract class Jogador {
    protected String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    // Comportamento comum a todos os jogadores
    public void correr() {
        System.out.println(nome + " está correndo em campo.");
    }

    // Comportamento que varia conforme a posição
    public abstract void executarFuncaoTatica();
}