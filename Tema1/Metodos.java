package Tema1;

public class Metodos {

    public static void main(String[] args) {
        saudacao(); //chamada de metodo sem parâmetro
        exibirDobro(8); //camada de metodo com parâmetro
    }

    //Metodo sem parâmetro
    public static void saudacao() {
        System.out.println("Olá, seja bem-vindo ao programa!");
    }

    //Metodo com parâmetro
    public static void exibirDobro(int numero) {
        int resultado = numero * 2;
        System.out.println("O dobro de " + numero + " é " + resultado);
    }
}

