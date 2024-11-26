package lista03.Q03;

public class Circulo {
    float raio;

    public Circulo() {
    }

    public Circulo(float raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
