package Tema7.Interface;

public class RelatorioPDF implements Exportavel {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando relatório em formato PDF: " + conteudo);
    }
}
