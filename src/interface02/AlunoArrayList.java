package interface02;

import java.util.ArrayList;
import java.util.Collections;

public class AlunoArrayList implements Aluno {
    private ArrayList<Double> notas;

    public AlunoArrayList() {
        notas = new ArrayList<>();
    }

    @Override
    public double calcularMedia() {
        if (notas.isEmpty()) return 0;
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    @Override
    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    @Override
    public void removerUltimaNota() {
        if (!notas.isEmpty()) {
            notas.remove(notas.size() - 1);
        }
    }

    @Override
    public double mostrarMaiorNota() {
        if (notas.isEmpty()) return 0;
        return Collections.max(notas);
    }
}