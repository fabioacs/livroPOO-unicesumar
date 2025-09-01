package Tema8.Exemplo2;

public class Main {
    public static void main(String[] args) {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
        System.out.println("Modo atual: " + config.getModo());

        config.setModo("desenvolvimento");

        ConfiguracaoSistema outraReferencia = ConfiguracaoSistema.getInstancia();
        System.out.println("Modo alterado: " + outraReferencia.getModo());
    }
}