package Tema7.Polimorfismo;

// Subclasse: Guerreiro
public class Guerreiro extends Personagem {
    @Override
    public void atacar() {
        System.out.println("O guerreiro ataca com sua espada!");
    }
}
