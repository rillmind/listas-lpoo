package lista1;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int abaixo = 0, ok = 0, acima = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Peso " + i + ": ");
            float peso = s.nextFloat();

            System.out.print("Peso " + i + ": ");
            float altura = s.nextFloat();

            float imc = peso/(altura*altura);

            if (imc <= 18.5) {
                abaixo++;
            } else if (imc > 18.5 && imc <= 25 ) {
                ok++;
            } else if (imc >= 25) {
                acima++;
            }
        }

        System.out.println("Pessoas com peso abaixo: " + abaixo);
        System.out.println("Pessoas com peso normal: " + ok);
        System.out.println("Pessoas com peso acima: " + acima);

        s.close();
    }
}
