package exceptions.questao02;

public class Calculadora {
    public double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }
}