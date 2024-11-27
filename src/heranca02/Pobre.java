package heranca02;

public class Pobre extends Pessoa {
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalha() {
        System.out.println(getNome() + " esta trabalhando.");
    }
}

