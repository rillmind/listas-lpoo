package lista01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1, n2;

        System.out.print("Primeiro número: ");
        n1 = s.nextInt();

        System.out.print("Primeiro número: ");
        n2 = s.nextInt();

        System.out.println("Operações: [+] [-] [*] [/]: ");
        String option = s.next();

        switch (option) {
            case "+":
                System.out.print(n1 + n2);
                break;
            case "-":
                System.out.print(n1 - n2);
                break;
            case "*":
                System.out.print(n1 * n2);
                break;
            case "/":
                System.out.print(n1 / n2);
        }

        s.close();
    }
}
