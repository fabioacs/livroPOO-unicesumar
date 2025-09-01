package Tema1;

public class EstruturaSwitch {
    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada");
                break;
            case 2:
                System.out.println("Opção 2 selecionada");
                break;
            case 3:
                System.out.println("Opção 3 selecionada");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}

