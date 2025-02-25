package interface01.questao03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disciplina disciplina = new Disciplina(10);

        System.out.println("Digite o número de alunos:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();
            System.out.println("Digite a nota do aluno:");
            double nota = scanner.nextDouble();
            scanner.nextLine();
            disciplina.insereAluno(new Aluno(nome, nota));
        }

        System.out.println("\nAlunos antes da ordenação:");
        disciplina.exibeAlunos();

        System.out.println("\nAlunos após a ordenação:");
        disciplina.ordena();
        disciplina.exibeAlunos();

        scanner.close();
    }
}