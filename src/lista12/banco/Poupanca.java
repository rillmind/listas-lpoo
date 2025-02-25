package lista12.banco;

public class Poupanca extends Conta {
    public Poupanca(String numeroConta, String cpfCliente, double taxa, double saldo, String banco) {
        super(numeroConta, cpfCliente, taxa, saldo, banco);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void atualizar() {
        setSaldo(getSaldo() + getTaxa());
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }
}