package lista02;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = s.next();

        String vogal = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            String w = "";

            w += word.charAt(i);

            if (w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u") || w.equals(" ")) {
                vogal += w;
            }

            System.out.println(vogal);
        }

        System.out.println("Quantidade de vogais: " + vogal.length());
    }
}
