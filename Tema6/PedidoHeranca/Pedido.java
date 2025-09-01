package Tema6.PedidoHeranca;

public class Pedido {
    private int numero;
    private double valorTotal;

    public Pedido(int numero, double valorTotal) {
        this.numero = numero;
        this.valorTotal = valorTotal;
    }

    public void exibirDetalhes() {
        System.out.println("Pedido número: " + numero);
        System.out.println("Valor total: R$ " + valorTotal);
    }
}
