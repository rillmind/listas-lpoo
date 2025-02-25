package exceptions.questao05;

public class EmailInvalidoException extends Exception {
    public EmailInvalidoException(String mensagem) {
        super(mensagem);
    }
}