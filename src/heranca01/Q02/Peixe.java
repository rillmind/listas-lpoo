package heranca01.Q02;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, double velocidade) {
        super(nome, comprimento, 0, "Cinzenta", "Mar", velocidade);
        this.caracteristicas = "Barbatanas e Cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String printDados() {
        return super.printDados() + ", Características: " + caracteristicas;
    }
}

