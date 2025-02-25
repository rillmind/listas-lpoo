package abstrata02;

class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}