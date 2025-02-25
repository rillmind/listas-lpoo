package interface01.questao03;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno outro) {
        return Double.compare(outro.nota, this.nota);
    }

    @Override
    public String toString() {
        return "Aluno [Nome=" + nome + ", Nota=" + nota + "]";
    }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}