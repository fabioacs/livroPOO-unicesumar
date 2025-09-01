package Tema7.ClasseAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    public static void main(String[] args) {
        List<Jogador> time = new ArrayList<>();
        time.add(new Goleiro("Carlos"));
        time.add(new Zagueiro("Fernanda"));
        time.add(new Atacante("João"));

        for (Jogador jogador : time) {
            jogador.correr();
            jogador.executarFuncaoTatica(); //Polimorfismo em tempo de execução
            System.out.println();
        }
    }
}