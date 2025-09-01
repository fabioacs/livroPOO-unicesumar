package Tema7.Interface;

public class ImagemPNG implements Exportavel {
    @Override
    public void exportar(String conteudo) {
        System.out.println("Exportando imagem PNG com legenda: " + conteudo);
    }
}
