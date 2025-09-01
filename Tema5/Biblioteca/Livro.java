package Tema5.Biblioteca;

import java.util.List;

public class Livro {
    private String titulo;
    private int ano;
    private List<Autor> autores; // Associação muitos-para-muitos
    private Editora editora;      // Agregação
    private Leitor leitorAtual;   // Associação 0..1 com Leitor

    public Livro(String titulo, int ano, List<Autor> autores, Editora editora) {
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.editora = editora;
    }

    public void setLeitorAtual(Leitor leitor) {
        this.leitorAtual = leitor;
    }

    public Leitor getLeitorAtual() {
        return leitorAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }
}
