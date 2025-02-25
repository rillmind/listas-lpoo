package exceptions.questao05;

public class ValidadorEmail {
    public void validarEmail(String email) throws EmailInvalidoException {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidoException("Email inválido. Deve conter '@' e um domínio válido.");
        }
        System.out.println("Email válido: " + email);
    }
}