package lista1;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, c = 0, idade;
        float soma = 0;

        while (true) {
            System.out.println(" ");
            System.out.println("1. Adicionar uma idade\n0. Sair...");
            n = s.nextInt();
            System.out.println(" ");
            c++;
            switch (n) {
                case 1:
                    System.out.print("Digite a idade: ");
                    idade = s.nextInt();
                    soma += idade;
                    break;
                case 0:
                    System.out.printf("Media das idades: %.2f", soma/c);
                    break;
            }
            if (n == 0){
                break;
            }
        }
        s.close();
    }
}