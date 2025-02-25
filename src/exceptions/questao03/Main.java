package exceptions.questao03;

public class Main {
    public static void main(String[] args) {
        CadastroUsuario cadastro = new CadastroUsuario();

        try {
            cadastro.cadastrarUsuario("", 25);
        } catch (IllegalArgumentException | IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            cadastro.cadastrarUsuario("João", 150);
        } catch (IllegalArgumentException | IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}