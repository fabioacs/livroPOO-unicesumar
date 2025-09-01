package Tema7.Interface;

public class PlanilhaExcel implements Exportavel {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando planilha Excel: " + conteudo);
    }
}