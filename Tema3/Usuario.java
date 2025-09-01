package Tema3;

class Usuario {
    private String nome;
    private String email;
    private String senha;

    public void cadastrar() {
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void acessarPerfil() {
        System.out.println("Acessando o perfil de " + nome);
    }

    public static void main(String[] args) {
        Usuario aluno = new Usuario();
        aluno.nome = "Fulano da Silva";
        aluno.email = "fulano@email.com";
        aluno.senha = "123456";
        aluno.acessarPerfil();
    }
}
