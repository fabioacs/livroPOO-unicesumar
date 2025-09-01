package Tema7.Interface;

public class Exportador {
    public static void main(String[] args) {
        Exportavel e1 = new RelatorioPDF();
        Exportavel e2 = new PlanilhaExcel();
        Exportavel e3 = new ImagemPNG();

        e1.exportar("Resumo do mês");
        e2.exportar("Dados financeiros");
        e3.exportar("Gráfico de desempenho");
    }
}