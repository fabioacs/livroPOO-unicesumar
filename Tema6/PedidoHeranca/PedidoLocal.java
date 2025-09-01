package Tema6.PedidoHeranca;

// Subclasse PedidoLocal
public class PedidoLocal extends Pedido {
    private int numeroMesa;

    public PedidoLocal(int numero, double valorTotal, int numeroMesa) {
        super(numero, valorTotal);
        this.numeroMesa = numeroMesa;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número da mesa: " + numeroMesa);
        System.out.println("-----------------------------------");
    }
}