package lista02;

import java.util.*;

public class Q07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Palavra: ");
            String word = s.next();

            String drow = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                drow += word.charAt(i);
            }

            System.out.println("arvalaP: " + drow);

            if (word.equals("0") || word.equals("zero")) {
                break;
            }
        }
    }
}
