package interface01.questao02;

public abstract class Building implements CarbonFootprint {
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
    return 0;
  }

  @Override
    public String toString() {
        return "Building [Pessoas=" + numeroPessoas + ", Energia Renovável=" + usaEnergiaRenovavel +
               ", Lâmpadas=" + numeroLampadas + ", Ar Condicionado=" + usaArCondicionado + "]";
    }
}