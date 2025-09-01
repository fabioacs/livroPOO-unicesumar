package Tema9.Desafio;

// Classe ContaBancaria
public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String
            titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo para saque
    public void sacar(double valor) throws SaldoInsuficienteException {
        // Você deve completar o tratamento aqui:
        // - Verificar se saldo é suficiente
        // - Caso não seja, lançar SaldoInsuficienteException
        // - Caso seja, diminuir saldo e informar saque realizado
    }

    public double getSaldo() {
        return saldo;
    }
}