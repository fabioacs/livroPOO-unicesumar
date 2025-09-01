package Tema9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExcecoesDemo {

    // EXEMPLO 1 — CHECKED: o compilador exige tratar ou declarar (throws)
    // Pode lançar IOException/FileNotFoundException ao abrir/ler arquivo.
    public static String lerPrimeiraLinha(String caminho) throws IOException {
        // try-with-resources: fecha o recurso automaticamente (equivalente a usar finally para fechar)
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            return br.readLine();
        }
    }

    // EXEMPLO 2 — UNCHECKED: o compilador NÃO exige tratamento
    // Pode lançar ArithmeticException (divisão por zero) em tempo de execução.
    public static int dividir(int a, int b) {
        return a / b; // se b == 0, lança ArithmeticException automaticamente
    }

    public static void main(String[] args) {
        // -------- CHECKED --------
        try {
            // Tente apontar para um arquivo que NÃO existe para ver a exceção acontecer
            String linha = lerPrimeiraLinha("dados.txt");
            System.out.println("Primeira linha do arquivo: " + linha);
        } catch (IOException e) {
            // Obrigatório tratar ou propagar: aqui tratamos mostrando uma mensagem amigável
            System.out.println("[AVISO] Não foi possível ler o arquivo agora. Tente verificar o caminho.");
            // Mensagem técnica útil para logs e diagnóstico:
            System.out.println("Detalhes técnicos: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        // -------- UNCHECKED --------
        try {
            int resultado = dividir(10, 0); // força divisão por zero
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Tratamento opcional (não é exigido pelo compilador, mas é boa prática informar e contornar)
            System.out.println("[AVISO] Operação inválida: divisão por zero. Ajuste os valores e tente novamente.");
            System.out.println("Detalhes técnicos: " + e.getClass().getSimpleName());
        } finally {
            // O bloco finally SEMPRE é executado (tenha ou não exceção) — bom para liberar recursos
            System.out.println("Finalizando rotinas da operação aritmética (limpeza, métricas, etc.).");
        }

        System.out.println("Programa continua executando normalmente após tratar as situações.");
    }
}