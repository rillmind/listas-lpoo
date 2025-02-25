package abstrata02;

abstract class PessoaIMC extends Pessoa {
    private double peso;
    private double altura;

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double calculaIMC() {
        return peso / (altura * altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}