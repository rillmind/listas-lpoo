package lista12.banco;

public abstract class Conta {
    private String numeroConta;
    private String cpfCliente;
    private double taxa;
    private double saldo;
    private String banco;

    public Conta(String numeroConta, String cpfCliente, double taxa, double saldo, String banco) {
        this.numeroConta = numeroConta;
        this.cpfCliente = cpfCliente;
        this.taxa = taxa;
        this.saldo = saldo;
        this.banco = banco;
    }

    public abstract void sacar(double valor);
    public abstract void atualizar();
    public abstract void depositar(double valor);

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getBanco() {
        return banco;
    }
}