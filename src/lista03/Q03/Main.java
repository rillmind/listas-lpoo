package lista03.Q03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circulo circulo = new Circulo();

        while (true) {
            menu();

            System.out.print("Escolha: ");
            String option = input.nextLine();
            System.out.println();

            switch (option) {
                case "1":
                    System.out.print("Raio: ");
                    circulo.setRaio(input.nextFloat());
                    break;

                case "2":
                    System.out.printf("Area: %.2f", circulo.calcularArea());
                    System.out.println();
                    break;

                case "3":
                    System.out.printf("Perimetro: %.2f", circulo.calcularPerimetro());
                    System.out.println();
                    break;

                case "0":
                    break;
            }

            if (option.equals("0")) {
                break;
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("1. Criar Circulo\n2. Calcular Area\n3. Calcular Perimetro\n0. Sair");
        System.out.println();
    }
}
