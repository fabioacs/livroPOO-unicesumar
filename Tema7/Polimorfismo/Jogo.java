package Tema7.Polimorfismo;

// Classe principal (main)
import java.util.ArrayList;
import java.util.List;


public class Jogo {
    public static void main(String[] args) {
        List<Personagem> equipe = new ArrayList<>();

        equipe.add(new Guerreiro());
        equipe.add(new Mago());
        equipe.add(new Arqueiro());

        System.out.println("A equipe se prepara para atacar!");

        for (Personagem p : equipe) {
            p.atacar(); // Ligação dinâmica em ação!
        }
    }
}