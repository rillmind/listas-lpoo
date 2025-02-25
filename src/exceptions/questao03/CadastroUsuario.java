package exceptions.questao03;

public class CadastroUsuario {
    public void cadastrarUsuario(String nome, int idade) throws IllegalArgumentException, IdadeInvalidaException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio.");
        }
        if (idade < 0 || idade > 120) {
            throw new IdadeInvalidaException("Idade inválida. Deve estar entre 0 e 120 anos.");
        }
        System.out.println("Usuário cadastrado: " + nome + ", Idade: " + idade);
    }
}