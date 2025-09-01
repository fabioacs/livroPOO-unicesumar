package Tema5.Associacao;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinas; // Associação com múltiplas disciplinas

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }
}
