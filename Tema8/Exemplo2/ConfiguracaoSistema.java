package Tema8.Exemplo2;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;
    private String modo;

    private ConfiguracaoSistema() {
        // Construtor privado impede criação externa
        this.modo = "produção";
    }

    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
}