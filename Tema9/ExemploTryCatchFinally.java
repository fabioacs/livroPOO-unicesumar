package Tema9;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        try {
            int numero = 10;
            int resultado = numero / 0; // Tentativa de divisão por zero
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero!");
        } finally {
            System.out.println("Bloco finally executado: operação finalizada.");
        }
    }
}