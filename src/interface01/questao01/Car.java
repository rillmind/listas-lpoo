package interface01.questao01;

public class Car implements CarbonFootprint {
    private String combustivel;
    private float cilindrada;

    public Car(String combustivel, float cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    @Override
    public double getCarbonFootprint() {
        double pegada = cilindrada * 10;
        if (combustivel.equalsIgnoreCase("gasolina")) pegada += 200;
        else if (combustivel.equalsIgnoreCase("diesel")) pegada += 300;
        return pegada;
    }

    @Override
    public String toString() {
        return "Car [Combustível=" + combustivel + ", Cilindrada=" + cilindrada + "]";
    }
}