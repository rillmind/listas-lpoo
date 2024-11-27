package heranca01.Q01;

public class ContaPoupanca extends ContaBancaria {
    private final int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        saldo += saldo * taxaRendimento / 100;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    @Override
    public String printDados() {
        return super.printDados() + ", Dia de Rendimento: " + diaRendimento;
    }
}

