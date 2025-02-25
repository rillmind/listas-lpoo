package interface02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoArrayList aluno = new AlunoArrayList();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- Adicionar uma nota");
            System.out.println("2- Remover a última nota");
            System.out.println("3- Calcular a média");
            System.out.println("4- Mostrar a maior nota tirada");
            System.out.println("0- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a nota:");
                    double nota = scanner.nextDouble();
                    aluno.adicionarNota(nota);
                    break;

                case 2:
                    aluno.removerUltimaNota();
                    System.out.println("Última nota removida.");
                    break;

                case 3:
                    System.out.println("Média: " + aluno.calcularMedia());
                    break;

                case 4:
                    System.out.println("Maior nota: " + aluno.mostrarMaiorNota());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}