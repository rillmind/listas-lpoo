package heranca02;

public class Cachorro extends Animal {
    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String raca) {
        super(nome,raca);
    }

    public String late() {
        return getNome() + " esta latindo.";
    }
}

