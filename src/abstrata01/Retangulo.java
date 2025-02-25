package abstrata01;

class Retangulo extends Quadrilatero {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }

    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }
}