package lista3.Q02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        while (true) {
            menu();

            System.out.print("Escolha: ");
            String opcao = s.nextLine();
            System.out.println();

            switch (opcao) {
                case "1":
                    System.out.print("Base: ");
                    retangulo.setBase(s.nextFloat());

                    System.out.print("Altura: ");
                    retangulo.setAltura(s.nextFloat());
                    break;

                case "2":
                    System.out.println("Area: " + retangulo.obterArea());
                    break;

                case "3":
                    System.out.println("Perimetro: " + retangulo.obterPerimetro());
                    break;

                case "0":
                    break;
            }

            if (opcao.equals("0")) {
                break;
            }
        }
    }

    public static void menu() {
        System.out.println();
        System.out.println("1. Criar um retangulo\n2. Calcular Area\n3. Calcular Perimetro\n0. Sair");
        System.out.println();
    }
}
