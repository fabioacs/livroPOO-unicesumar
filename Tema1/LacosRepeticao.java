package Tema1;

public class LacosRepeticao {
    public static void main(String[] args) {

        //Exemplo usando um laço de repetição com controle fixo (for)
        for (int i = 0; i < 5; i++) {
            System.out.println("Repetição número: " + i);
        }

        //Exemplo usando o laço de repetição baseada em condição (while)
        int contador = 0;

        while (contador < 5) {
            System.out.println("Contando: " + contador);
            contador++;
        }

        //Exemplo usando o laço de repetição que executa pelo menos uma vez (do-while)
        int numero = 1;

        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 3);

    }
}

