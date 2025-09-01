package Tema5.Agregacao;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Desenvolvedor> membros;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Desenvolvedor d) {
        membros.add(d);
    }
}
