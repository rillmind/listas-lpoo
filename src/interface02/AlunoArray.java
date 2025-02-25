package interface02;

public class AlunoArray implements Aluno {
    private double[] notas;
    private int quantidade;

    public AlunoArray(int capacidade) {
        notas = new double[capacidade];
        quantidade = 0;
    }

    @Override
    public double calcularMedia() {
        if (quantidade == 0) return 0;
        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += notas[i];
        }
        return soma / quantidade;
    }

    @Override
    public void adicionarNota(double nota) {
        if (quantidade < notas.length) {
            notas[quantidade++] = nota;
        } else {
            System.out.println("Capacidade máxima de notas atingida!");
        }
    }

    @Override
    public void removerUltimaNota() {
        if (quantidade > 0) {
            quantidade--;
        }
    }

    @Override
    public double mostrarMaiorNota() {
        if (quantidade == 0) return 0;
        double maior = notas[0];
        for (int i = 1; i < quantidade; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        return maior;
    }
}