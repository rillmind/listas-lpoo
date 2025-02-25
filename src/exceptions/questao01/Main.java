package exceptions.questao01;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        try {
            conta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}