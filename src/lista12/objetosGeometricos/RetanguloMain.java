package lista12.objetosGeometricos;

import java.util.Scanner;

public class RetanguloMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = null;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- Digitar valor de base e altura");
            System.out.println("2- Calcular Área");
            System.out.println("3- Calcular Perímetro");
            System.out.println("0- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor da base:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite o valor da altura:");
                    double altura = scanner.nextDouble();
                    retangulo = new Retangulo(base, altura);
                    break;

                case 2:
                    if (retangulo != null) {
                        System.out.println("Área: " + retangulo.calcularArea());
                    } else {
                        System.out.println("Valores da base e altura não foram definidos.");
                    }
                    break;

                case 3:
                    if (retangulo != null) {
                        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                    } else {
                        System.out.println("Valores da base e altura não foram definidos.");
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