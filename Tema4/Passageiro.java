package Tema4;

public class Passageiro {
    private String nome;
    private String telefone;
    private String localizacaoAtual;

    // Construtor
    public Passageiro(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter para telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter para localização atual
    public String getLocalizacaoAtual() {
        return localizacaoAtual;
    }

    // Setter para localização atual
    public void setLocalizacaoAtual(String localizacaoAtual) {
        this.localizacaoAtual = localizacaoAtual;
    }
}