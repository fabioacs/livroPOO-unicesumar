package Tema6.PedidoHeranca;

public class Main {
    public static void main(String[] args) {

        // Criando um pedido local
        PedidoLocal pedidoLocal = new PedidoLocal(1, 50.0, 12);

        // Criando um pedido delivery
        PedidoDelivery pedidoDelivery = new PedidoDelivery(2, 75.0, "Rua das Flores, 123");

        // Exibindo detalhes dos pedidos
        pedidoLocal.exibirDetalhes();
        pedidoDelivery.exibirDetalhes();
    }
}