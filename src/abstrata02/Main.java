package abstrata02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PessoaIMC> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Homem");
            System.out.println("2. Cadastrar Mulher");
            System.out.println("3. Consultar IMC (Busca pelo nome)");
            System.out.println("4. Listar Homens");
            System.out.println("5. Listar Mulheres");
            System.out.println("6. Listar todos os IMCs dos Homens");
            System.out.println("7. Listar todos os IMCs");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do homem:");
                    String nomeHomem = scanner.nextLine();
                    System.out.println("Digite a data de nascimento (dd/MM/aaaa):");
                    String dataNascimentoHomem = scanner.nextLine();
                    System.out.println("Digite o peso:");
                    double pesoHomem = scanner.nextDouble();
                    System.out.println("Digite a altura:");
                    double alturaHomem = scanner.nextDouble();
                    pessoas.add(new Homem(nomeHomem, dataNascimentoHomem, pesoHomem, alturaHomem));
                    break;

                case 2:
                    System.out.println("Digite o nome da mulher:");
                    String nomeMulher = scanner.nextLine();
                    System.out.println("Digite a data de nascimento (dd/MM/aaaa):");
                    String dataNascimentoMulher = scanner.nextLine();
                    System.out.println("Digite o peso:");
                    double pesoMulher = scanner.nextDouble();
                    System.out.println("Digite a altura:");
                    double alturaMulher = scanner.nextDouble();
                    pessoas.add(new Mulher(nomeMulher, dataNascimentoMulher, pesoMulher, alturaMulher));
                    break;

                case 3:
                    System.out.println("Digite o nome para consultar o IMC:");
                    String nomeConsulta = scanner.nextLine();
                    for (PessoaIMC pessoa : pessoas) {
                        if (pessoa.getNome().equalsIgnoreCase(nomeConsulta)) {
                            System.out.println(pessoa.toString());
                            System.out.println("IMC: " + pessoa.calculaIMC());
                            System.out.println("Resultado: " + pessoa.resultIMC());
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Lista de Homens:");
                    for (PessoaIMC pessoa : pessoas) {
                        if (pessoa instanceof Homem) {
                            System.out.println(pessoa.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Lista de Mulheres:");
                    for (PessoaIMC pessoa : pessoas) {
                        if (pessoa instanceof Mulher) {
                            System.out.println(pessoa.toString());
                        }
                    }
                    break;

                case 6:
                    System.out.println("IMCs dos Homens:");
                    for (PessoaIMC pessoa : pessoas) {
                        if (pessoa instanceof Homem) {
                            System.out.println(pessoa.getNome() + " - IMC: " + pessoa.calculaIMC() + " - " + pessoa.resultIMC());
                        }
                    }
                    break;

                case 7:
                    System.out.println("Todos os IMCs:");
                    for (PessoaIMC pessoa : pessoas) {
                        System.out.println(pessoa.getNome() + " - IMC: " + pessoa.calculaIMC() + " - " + pessoa.resultIMC());
                    }
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