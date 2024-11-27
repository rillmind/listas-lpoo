package heranca01.Q01;

public class ContaEspecial extends ContaBancaria {
    private final double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            return true;
        }
        System.out.println("Valor indisponivel!");
        return false;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public String printDados() {
        return super.printDados() + ", Limite: R$ " + limite;
    }
}

