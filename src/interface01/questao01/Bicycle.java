package interface01.questao01;

public class Bicycle implements CarbonFootprint {
    private String tipo;
    private boolean temCesta;

    public Bicycle(String tipo, boolean temCesta) {
        this.tipo = tipo;
        this.temCesta = temCesta;
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }

    @Override
    public String toString() {
        return "Bicycle [Tipo=" + tipo + ", Tem Cesta=" + temCesta + "]";
    }
}