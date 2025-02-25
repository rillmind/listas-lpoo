package lista12.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- Cadastrar Conta Corrente");
            System.out.println("2- Cadastrar Poupança");
            System.out.println("3- Atualizar Conta Corrente");
            System.out.println("4- Atualizar Poupança");
            System.out.println("5- Saque Conta Corrente");
            System.out.println("6- Saque Poupança");
            System.out.println("7- Verificar saldo de Conta Corrente");
            System.out.println("8- Verificar saldo de Poupança");
            System.out.println("0- Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o número da conta:");
                    String numeroContaCC = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String cpfClienteCC = scanner.nextLine();
                    System.out.println("Digite a taxa:");
                    double taxaCC = scanner.nextDouble();
                    System.out.println("Digite o saldo inicial:");
                    double saldoCC = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o banco:");
                    String bancoCC = scanner.nextLine();
                    contas.add(new ContaCorrente(numeroContaCC, cpfClienteCC, taxaCC, saldoCC, bancoCC));
                    break;

                case 2:
                    System.out.println("Digite o número da conta:");
                    String numeroContaPoup = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String cpfClientePoup = scanner.nextLine();
                    System.out.println("Digite a taxa:");
                    double taxaPoup = scanner.nextDouble();
                    System.out.println("Digite o saldo inicial:");
                    double saldoPoup = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite o banco:");
                    String bancoPoup = scanner.nextLine();
                    contas.add(new Poupanca(numeroContaPoup, cpfClientePoup, taxaPoup, saldoPoup, bancoPoup));
                    break;

                case 3:
                    System.out.println("Digite o número da conta corrente:");
                    String numeroContaAtualizarCC = scanner.nextLine();
                    for (Conta conta : contas) {
                        if (conta instanceof ContaCorrente && conta.getNumeroConta().equals(numeroContaAtualizarCC)) {
                            conta.atualizar();
                            System.out.println("Conta corrente atualizada.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite o número da poupança:");
                    String numeroContaAtualizarPoup = scanner.nextLine();
                    for (Conta conta : contas) {
                        if (conta instanceof Poupanca && conta.getNumeroConta().equals(numeroContaAtualizarPoup)) {
                            conta.atualizar();
                            System.out.println("Poupança atualizada.");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Digite o número da conta corrente:");
                    String numeroContaSaqueCC = scanner.nextLine();
                    System.out.println("Digite o valor do saque:");
                    double valorSaqueCC = scanner.nextDouble();
                    for (Conta conta : contas) {
                        if (conta instanceof ContaCorrente && conta.getNumeroConta().equals(numeroContaSaqueCC)) {
                            conta.sacar(valorSaqueCC);
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Digite o número da poupança:");
                    String numeroContaSaquePoup = scanner.nextLine();
                    System.out.println("Digite o valor do saque:");
                    double valorSaquePoup = scanner.nextDouble();
                    for (Conta conta : contas) {
                        if (conta instanceof Poupanca && conta.getNumeroConta().equals(numeroContaSaquePoup)) {
                            conta.sacar(valorSaquePoup);
                            break;
                        }
                    }
                    break;

                case 7:
                    System.out.println("Digite o número da conta corrente:");
                    String numeroContaSaldoCC = scanner.nextLine();
                    for (Conta conta : contas) {
                        if (conta instanceof ContaCorrente && conta.getNumeroConta().equals(numeroContaSaldoCC)) {
                            System.out.println("Saldo: " + conta.getSaldo());
                            break;
                        }
                    }
                    break;

                case 8:
                    System.out.println("Digite o número da poupança:");
                    String numeroContaSaldoPoup = scanner.nextLine();
                    for (Conta conta : contas) {
                        if (conta instanceof Poupanca && conta.getNumeroConta().equals(numeroContaSaldoPoup)) {
                            System.out.println("Saldo: " + conta.getSaldo());
                            break;
                        }
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