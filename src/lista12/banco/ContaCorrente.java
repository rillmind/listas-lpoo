package lista12.banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numeroConta, String cpfCliente, double taxa, double saldo, String banco) {
        super(numeroConta, cpfCliente, taxa, saldo, banco);
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor + 0.30) {
            setSaldo(getSaldo() - valor - 0.30);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void atualizar() {
        setSaldo(getSaldo() - getTaxa());
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }
}