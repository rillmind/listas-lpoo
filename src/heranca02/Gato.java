package heranca02;

public class Gato extends Animal {
    public Gato() {
        super();
    }

    public Gato(String nome, String raca) {
        super(nome,raca);
    }

    public String mia() {
        return getNome() + " esta miando.";
    }
}

