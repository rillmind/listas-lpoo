package lista02;

import java.util.*;

public class Q06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        for (int I = 0; I < 5; I++) {
            System.out.print("Digite um valor para primeira lista: ");
            int valor = s.nextInt();
            lista1.add(valor);
        }

        for (int I = 0; I < 5; I++) {
            System.out.print("Digite um valor para segunda lista: ");
            int valor = s.nextInt();
            lista2.add(valor);
        }

        if (lista1.equals(lista2)) {
            System.out.println("Lista iguais");
        } else {
            System.out.println("Listas diferentes");
        }
    }
}
