package lista2;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            nums.add(s.nextInt());
        }

        for (int x : nums) {
            soma += x;
        }

        System.out.println(soma);
    }
}
