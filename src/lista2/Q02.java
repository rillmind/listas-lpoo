package lista2;

import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maior = 0, menor = 0, soma = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.print("Digite um numero: ");
            int n = s.nextInt();

            if (n > maior) {
                maior = n;
            }

            if (n < menor || menor == 0) {
                menor = n;
            }
            soma += n;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + soma / 10);
    }
}
