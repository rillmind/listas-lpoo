package heranca02;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, String numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Bonus Salarial: R$" + bonusSalarial);
        System.out.println("Salario Total: R$" + (salario + bonusSalarial));
    }
}

