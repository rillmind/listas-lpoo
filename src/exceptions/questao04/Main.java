package exceptions.questao04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
        } finally {
            System.out.println("Bloco finally executado.");
            scanner.close();
        }
    }
}