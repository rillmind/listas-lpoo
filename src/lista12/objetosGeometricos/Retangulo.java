package lista12.objetosGeometricos;

public class Retangulo implements ObjetoGeometrico {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}