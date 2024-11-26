package lista01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int birthDate, anoAtual;

        System.out.print("Digite sua data de nascimento: ");
        birthDate = s.nextInt();

        System.out.print("Digite a data do ano atual: ");
        anoAtual = s.nextInt();

        System.out.println(" ");

        System.out.print("Idade: " + (anoAtual - birthDate));

        s.close();
    }
}