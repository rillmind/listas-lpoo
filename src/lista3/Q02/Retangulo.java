package lista3.Q02;

public class Retangulo {
    float base, altura;

    public Retangulo() {
    }

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float obterArea() {
        return base * altura;
    }

    public float obterPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
