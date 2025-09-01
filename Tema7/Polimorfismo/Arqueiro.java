package Tema7.Polimorfismo;

// Subclasse: Arqueiro
public class Arqueiro extends Personagem {
    @Override
    public void atacar() {
        System.out.println("O arqueiro dispara uma flecha precisa!");
    }
}
