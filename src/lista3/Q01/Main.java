package lista3.Q01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Estudante estudante = new Estudante();

        while (true) {
            Menu();

            System.out.print("Escolha: ");
            int opcao = s.nextInt();
            s.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = s.nextLine();

                    System.out.print("Matricula: ");
                    String matricula = s.nextLine();

                    System.out.print("Endereco: ");
                    String endereco = s.nextLine();

                    List<Float> notas = new ArrayList<>();

                    for (int i = 1; i <= 4; i++) {
                        System.out.print(i + "° Nota: ");
                        notas.add(s.nextFloat());
                    }

                    estudante = new Estudante(nome, matricula, endereco, notas);
                    break;

                case 2:
                    float result;
                    result = estudante.calcularMedia();

                    if (result >= 6) {
                        System.out.println("Aprovado!");
                    } else {
                        System.out.println("Reprovado!");
                    }

                    System.out.printf("Media: %.1f", result);
                    System.out.println();
                    break;

                case 3:
                    String mat = estudante.getMatricula();
                    System.out.println("Matricula: " + mat);
                    break;

                case 4:
                    String end = estudante.getEndereco();
                    System.out.println("Endereco: " + end);
                    break;

                case 0:
                    break;
            }

            if (opcao == 0) {
                break;
            }
        }
    }

    public static void Menu() {
        System.out.println();
        System.out.println("1. Criar um estudante.");
        System.out.println("2. Calcular media.");
        System.out.println("3. Obter matricula.");
        System.out.println("4. Obter endereco.");
        System.out.println("0. Sair.");
        System.out.println();
    }
}