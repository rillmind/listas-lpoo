package lista01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float soma = 0;
        float altura;

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite a altura: ");
            altura = s.nextFloat();
            soma += altura;
        }

        System.out.printf("Resultado = %.2f", soma / 5);

        s.close();
    }
}
