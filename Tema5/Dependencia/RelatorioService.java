package Tema5.Dependencia;

public class RelatorioService {
    public void gerarRelatorio() {
        String dados = "Relatório de vendas do mês de junho";

        // Uso pontual de outra classe: relação de dependência
        ExportadorPDF exportador = new ExportadorPDF();
        exportador.exportar(dados);
    }
}
