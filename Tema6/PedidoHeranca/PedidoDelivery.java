package Tema6.PedidoHeranca;

// Subclasse PedidoDelivery
public class PedidoDelivery extends Pedido {
    private String enderecoEntrega;

    public PedidoDelivery(int numero, double valorTotal, String enderecoEntrega) {
        super(numero, valorTotal);
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Endereço de entrega: " + enderecoEntrega);
        System.out.println("-----------------------------------");
    }
}