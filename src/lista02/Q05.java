package lista02;

import java.util.*;

public class Q05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        System.out.print("Quantos nomes deseja cadastrar: ");
        int n = s.nextInt();

        for (int I = 0; I < n; I++) {
            System.out.print("Digite o nome: ");
            nomes.add(s.next());
        }

        while (true) {
            System.out.print("Qual nome deseja consultar: ");
            String name = s.next();

            boolean isTrue = false;
            for (String nome : nomes) {
                if (nome.equals(name)) {
                    System.out.println(nome);
                    isTrue = true;
                }
            }
            if (name.equals("0")) {
                isTrue = true;
                break;
            }

            if (!isTrue) {
                System.out.println("Nome não encontrado!");
            }
        }
    }
}
