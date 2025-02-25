package interface01.questao01;

public class Building implements CarbonFootprint {
    private int numeroPessoas;
    private boolean usaEnergiaRenovavel;
    private int numeroLampadas;
    private boolean usaArCondicionado;

    public Building(int numeroPessoas, boolean usaEnergiaRenovavel, int numeroLampadas, boolean usaArCondicionado) {
        this.numeroPessoas = numeroPessoas;
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
        this.numeroLampadas = numeroLampadas;
        this.usaArCondicionado = usaArCondicionado;
    }

    @Override
    public double getCarbonFootprint() {
        double pegada = numeroPessoas * 100;
        if (!usaEnergiaRenovavel) pegada += 500;
        if (usaArCondicionado) pegada += 300;
        pegada += numeroLampadas * 10;
        return pegada;
    }

    @Override
    public String toString() {
        return "Building [Pessoas=" + numeroPessoas + ", Energia Renovável=" + usaEnergiaRenovavel +
               ", Lâmpadas=" + numeroLampadas + ", Ar Condicionado=" + usaArCondicionado + "]";
    }
}