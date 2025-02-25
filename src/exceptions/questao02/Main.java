package exceptions.questao02;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            System.out.println("Resultado da divisão: " + calculadora.dividir(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}