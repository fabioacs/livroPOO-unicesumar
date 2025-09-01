package Tema6.Heranca;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
