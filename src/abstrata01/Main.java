package abstrata01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrilatero[] quadrilateros = new Quadrilatero[10];
        int count = 0;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Retângulo");
            System.out.println("2. Cadastrar Círculo");
            System.out.println("3. Cadastrar Quadrado");
            System.out.println("4. Mostrar o valor de todas as áreas");
            System.out.println("5. Mostrar o valor de todos os perímetros");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 1 && count < 10) {
                System.out.println("Digite o lado do retângulo:");
                float lado = scanner.nextFloat();
                System.out.println("Digite a altura do retângulo:");
                float altura = scanner.nextFloat();
                quadrilateros[count++] = new Retangulo(lado, altura);
            } else if (opcao == 2 && count < 10) {
                System.out.println("Digite o raio do círculo:");
                float raio = scanner.nextFloat();
                quadrilateros[count++] = new Circulo(raio);
            } else if (opcao == 3 && count < 10) {
                System.out.println("Digite o lado do quadrado:");
                float lado = scanner.nextFloat();
                quadrilateros[count++] = new Quadrado(lado);
            } else if (opcao == 4) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Área do quadrilátero " + (i + 1) + ": " + quadrilateros[i].calcularArea());
                }
            } else if (opcao == 5) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Perímetro do quadrilátero " + (i + 1) + ": " + quadrilateros[i].calcularPerimetro());
                }
            } else if (opcao == 6) {
                break;
            } else {
                System.out.println("Opção inválida ou array cheio.");
            }
        }

        scanner.close();
    }
}