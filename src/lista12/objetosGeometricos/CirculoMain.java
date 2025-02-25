package lista12.objetosGeometricos;

import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = null;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- Digitar valor do raio");
            System.out.println("2- Calcular Área");
            System.out.println("3- Calcular Perímetro");
            System.out.println("0- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do raio:");
                    double raio = scanner.nextDouble();
                    circulo = new Circulo(raio);
                    break;

                case 2:
                    if (circulo != null) {
                        System.out.println("Área: " + circulo.calcularArea());
                    } else {
                        System.out.println("Valor do raio não foi definido.");
                    }
                    break;

                case 3:
                    if (circulo != null) {
                        System.out.println("Perímetro: " + circulo.calcularPerimetro());
                    } else {
                        System.out.println("Valor do raio não foi definido.");
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