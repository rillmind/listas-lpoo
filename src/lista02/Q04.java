package lista02;

import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        for (int I = 0; I < 10; I++) {
            System.out.print("Digite um numero: ");
            int n = s.nextInt();
            lista.add(n);
        }

        Collections.reverse(lista);

        System.out.println(lista);
    }
}
