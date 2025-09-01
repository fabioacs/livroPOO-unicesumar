package Tema5.Biblioteca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando autores
        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Clarice Lispector");

        // Criando editora
        Editora editora = new Editora("Companhia das Letras");

        // Criando livros
        Livro livro1 = new Livro("Dom Casmurro", 1899, Arrays.asList(autor1), editora);
        Livro livro2 = new Livro("A Hora da Estrela", 1977, Arrays.asList(autor2), editora);
        Livro livro3 = new Livro("Livro em Coautoria", 2024, Arrays.asList(autor1, autor2), editora);

        // Criando biblioteca e adicionando livros
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando leitor
        Leitor leitor = new Leitor("João Silva");

        // Realizando empréstimos
        ServicoDeEmprestimo servico = new ServicoDeEmprestimo();
        servico.emprestarLivro(leitor, livro1);
        servico.emprestarLivro(leitor, livro2);

        // Tentando emprestar um livro já emprestado
        Leitor leitor2 = new Leitor("Maria Souza");
        servico.emprestarLivro(leitor2, livro1); // Deve informar que já está emprestado

        // Exibindo livros emprestados pelo leitor
        System.out.println("\nLivros emprestados por " + leitor.getNome() + ":");
        for (Livro l : leitor.getLivrosEmprestados()) {
            System.out.println("- " + l.getTitulo());
        }
    }
}