package interface01.questao02;

public class House extends Building {
    public House(int numeroPessoas, boolean usaEnergiaRenovavel, int numeroLampadas, boolean usaArCondicionado) {
        super(numeroPessoas, usaEnergiaRenovavel, numeroLampadas, usaArCondicionado);
    }

    @Override
    public double getCarbonFootprint() {
        double pegada = super.getCarbonFootprint();
        return pegada * 0.8;
    }
}