package heranca01.Q01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();
        int LIMITE_CONTAS = 5;
        Scanner s = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("Escolha: ");
            int option = s.nextInt(); s.nextLine();

            switch (option) {
                case 1:
                    if (contas.size() >= LIMITE_CONTAS) {
                        System.out.println("Limite de contas atingido!");
                        return;
                    }

                    System.out.print("Nome do cliente: ");
                    String nome = s.next();
                    System.out.print("Numero da conta: ");
                    int numero = s.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldo = s.nextDouble();

                    System.out.println("Tipo de conta:");
                    System.out.println("1) Conta Poupanca");
                    System.out.println("2) Conta Especial");
                    int tipo = s.nextInt();

                    if (tipo == 1) {
                        System.out.print("Dia de rendimento: ");
                        int diaRendimento = s.nextInt();
                        contas.add(new ContaPoupanca(nome, numero, saldo, diaRendimento));
                    } else if (tipo == 2) {
                        System.out.print("Limite da conta: ");
                        double limite = s.nextDouble();
                        contas.add(new ContaEspecial(nome, numero, saldo, limite));
                    } else {
                        System.out.println("Tipo de conta invalido!");
                    }
                    break;
                case 2:
                    System.out.print("Numero da conta: ");
                    numero = s.nextInt();
                    for (ContaBancaria conta : contas) {
                        if(conta.getNumConta() == numero) {
                            System.out.print("Valor a sacar: ");
                            double valor = s.nextDouble();
                            if (conta.sacar(valor)) {
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente!");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Numero da conta: ");
                    numero = s.nextInt();
                    for (ContaBancaria conta : contas) {
                        if(conta.getNumConta() == numero) {
                            System.out.print("Valor a depositar: ");
                            double valor = s.nextDouble();
                            conta.depositar(valor);
                            System.out.println("Deposito realizado com sucesso!");
                        }
                        }
                    break;
                case 4:
                    System.out.print("Numero da conta: ");
                    numero = s.nextInt();

                    for (ContaBancaria conta : contas) {
                        if(conta.getNumConta() == numero) {
                            if (conta instanceof ContaPoupanca) {
                                System.out.print("Taxa de rendimento: ");
                                double taxa = s.nextDouble();
                                ((ContaPoupanca) conta).calcularNovoSaldo(taxa);
                                System.out.println("Novo saldo calculado!");
                            } else {
                                System.out.println("Conta nao e do tipo poupança!");
                            }
                        }
                    }
                    break;
                case 5:
                    if (contas.isEmpty()) {
                        System.out.println("Nenhuma conta cadastrada.");
                    } else {
                        System.out.println("-----------------------------");
                        for (ContaBancaria conta : contas) {
                            System.out.println(conta.printDados());
                            System.out.println("-----------------------------");
                        }
                    }
                case 0:
                    break;
            }
            if (option == 0) {
                break;
            }
        }

    }
    public static void menu() {
        System.out.println();
        System.out.println("1. Incluir conta de cliente\n2. Sacar uma conta\n3. Depositar em uma conta\n4. Calcular novo saldo (Poupanca)\n5. Mostrar dados de todas as contas\n0. Sair");
        System.out.println();
    }
}
