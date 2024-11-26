package lista3.Q01;

import java.util.*;

public class Estudante {
    String nome;
    String matricula;
    String endereco;
    List<Float> notas  = new ArrayList<>();

    public Estudante(String nome, String matricula, String endereco, List<Float> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.notas = notas;
    }

    public float calcularMedia() {
        float soma = 0;
        for (Float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public Estudante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }
}
