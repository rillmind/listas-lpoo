package interface01.questao02;

public class School extends Building {
    public School(int numeroPessoas, boolean usaEnergiaRenovavel, int numeroLampadas, boolean usaArCondicionado) {
        super(numeroPessoas, usaEnergiaRenovavel, numeroLampadas, usaArCondicionado);
    }

    @Override
    public double getCarbonFootprint() {
        double pegada = super.getCarbonFootprint();
        return pegada * 1.2;
    }
}