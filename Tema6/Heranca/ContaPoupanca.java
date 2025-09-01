package Tema6.Heranca;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(String titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}