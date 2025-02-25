package interface01.questao03;

import java.util.Arrays;

public class Disciplina {
    private Aluno[] alunos;
    private int quantidade;

    public Disciplina(int capacidade) {
        alunos = new Aluno[capacidade];
        quantidade = 0;
    }

    public void insereAluno(Aluno aluno) {
        if (quantidade < alunos.length) {
            alunos[quantidade++] = aluno;
        }
    }

    public void removeAluno(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(nome)) {
                for (int j = i; j < quantidade - 1; j++) {
                    alunos[j] = alunos[j + 1];
                }
                quantidade--;
                break;
            }
        }
    }

    public void exibeAlunos() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(alunos[i]);
        }
    }

    public void ordena() {
        Arrays.sort(alunos, 0, quantidade);
    }
}