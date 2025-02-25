package exceptions.questao05;

public class Main {
    public static void main(String[] args) {
        ValidadorEmail validador = new ValidadorEmail();

        try {
            validador.validarEmail("usuario@dominio.com");
            validador.validarEmail("usuario");
        } catch (EmailInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}