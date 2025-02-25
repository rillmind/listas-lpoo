package lista12.objetosGeometricos;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteObjetosGeometricos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ObjetoGeometrico> objetos = new ArrayList<>();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1- Adicionar um Círculo");
            System.out.println("2- Adicionar um Retângulo");
            System.out.println("3- Calcular média das áreas");
            System.out.println("4- Calcular média dos perímetros");
            System.out.println("0- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do raio:");
                    double raio = scanner.nextDouble();
                    objetos.add(new Circulo(raio));
                    break;

                case 2:
                    System.out.println("Digite o valor da base:");
                    double base = scanner.nextDouble();
                    System.out.println("Digite o valor da altura:");
                    double altura = scanner.nextDouble();
                    objetos.add(new Retangulo(base, altura));
                    break;

                case 3:
                    System.out.println("Média das áreas: " + calcularMediaAreas(objetos));
                    break;

                case 4:
                    System.out.println("Média dos perímetros: " + calcularMediaPerimetros(objetos));
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

    private static double calcularMediaAreas(ArrayList<ObjetoGeometrico> objetos) {
        if (objetos.isEmpty()) return 0;
        double soma = 0;
        for (ObjetoGeometrico obj : objetos) {
            soma += obj.calcularArea();
        }
        return soma / objetos.size();
    }

    private static double calcularMediaPerimetros(ArrayList<ObjetoGeometrico> objetos) {
        if (objetos.isEmpty()) return 0;
        double soma = 0;
        for (ObjetoGeometrico obj : objetos) {
            soma += obj.calcularPerimetro();
        }
        return soma / objetos.size();
    }
}