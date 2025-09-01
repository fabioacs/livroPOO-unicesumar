package Tema9.Desafio;

// Classe da exceção personalizada
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}